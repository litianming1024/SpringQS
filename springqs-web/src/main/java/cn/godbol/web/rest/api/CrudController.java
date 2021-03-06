package cn.godbol.web.rest.api;

import cn.godbol.service.api.CrudService;

import java.io.Serializable;

/**
 * Created by li on 17-2-22.
 */
public interface CrudController<T, ID extends Serializable, Q extends Serializable, DTO> extends
        SaveController<T, ID, DTO>,
        DeleteController<T, ID>,
        FindController<T, ID, Q, DTO>,
        UpdateController<T, ID, DTO> {
    // TODO 虽然没报错，但是这里情况无法解释清楚，不确定是否会发生类型转换的错误
    @Override
    CrudService<T, ID> getService();
}
