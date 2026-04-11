package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CashManagementCustomReasonCode.class, name = "CashManagementCustomReasonCode"),
    @JsonSubTypes.Type(value = CashManagementDefaultReasonCode.class, name = "CashManagementDefaultReasonCode"),
    @JsonSubTypes.Type(value = CashManagementSystemReasonCode.class, name = "CashManagementSystemReasonCode")
})
public interface CashManagementReasonCode {
}
