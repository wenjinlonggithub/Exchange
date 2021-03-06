package cn.ztuo.bitrade.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * @author GuoShuai
 * @date 2018年01月22日
 */
@Data
public class AppealApply {
    @NotNull(message = "缺少参数")
    private String orderSn;
    @NotBlank(message = "申诉原因不能为空")
    private String remark;

    private String imgUrls;
}
