package cn.com.talklaw.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.io.Serializable;

/**
 * @author wangcc
 * @date 2017/11/17
 * @describe base viewholder
 */

public abstract class BaseViewHolder<T extends Serializable> extends RecyclerView.ViewHolder {
    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void update(T model);
}
