package cn.gavinliu.notificationbox.ui;

/**
 * Created by Gavin on 2016/10/11.
 */

public interface BaseView<T extends BasePresenter> {

    void setPresenter(T presenter);

}
