package com.nails.api.form.orders;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class CreateOrdersForm {

    @ApiModelProperty(name = "ordersSaleOff")
    @Min(0)
    @Max(100)
    private Integer ordersSaleOff;

    @ApiModelProperty(name = "ordersDocument")
    private String ordersDocument;

    @ApiModelProperty(name = "ordersAddress")
    private String ordersAddress;

    @ApiModelProperty(name = "email")
    private String customerEmail;

    @NotEmpty(message = "customerPhone cannot be null")
    @ApiModelProperty(required = true)
    private String customerPhone;

    @NotEmpty(message = "customerFullName cannot be null")
    @ApiModelProperty(required = true)
    private String customerFullName;

    @NotEmpty(message = "ordersDetailDtoList cannot be null")
    @ApiModelProperty(required = true)
    private List<@Valid CreateOrdersDetailForm> ordersDetailDtos;
}
