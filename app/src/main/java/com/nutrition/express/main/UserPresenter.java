package com.nutrition.express.main;

import com.nutrition.express.model.rest.ApiService.UserService;
import com.nutrition.express.model.rest.ResponseListener;
import com.nutrition.express.model.rest.RestCallBack;
import com.nutrition.express.model.rest.RestClient;
import com.nutrition.express.model.rest.bean.BaseBean;
import com.nutrition.express.model.rest.bean.UserInfo;

import retrofit2.Call;

/**
 * Created by huang on 11/2/16.
 */

public class UserPresenter implements UserContract.Presenter, ResponseListener {
    private UserService service;
    private UserContract.View view;
    private Call<BaseBean<UserInfo>> call;

    public UserPresenter(UserContract.View view) {
        this.view = view;
        service = RestClient.getInstance().getUserService();
    }

    @Override
    public void getMyInfo() {
        if (call == null) {
            call = service.getInfo("OAuth");
            call.enqueue(new RestCallBack<UserInfo>(this, "info"));
        }
    }

    @Override
    public void onAttach() {

    }

    @Override
    public void onDetach() {
        view = null;
    }

    @Override
    public void onResponse(BaseBean baseBean, String tag) {
        if (view == null) {
            return;
        }
        call = null;
        view.showMyInfo((UserInfo) baseBean.getResponse());
    }

    @Override
    public void onFailure(String tag) {
        if (view == null) {
            return;
        }
        call = null;
        view.showFailure();
    }
}