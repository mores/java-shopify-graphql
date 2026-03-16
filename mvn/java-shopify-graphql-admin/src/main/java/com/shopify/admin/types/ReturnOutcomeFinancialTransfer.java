package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = InvoiceReturnOutcome.class, name = "InvoiceReturnOutcome"),
    @JsonSubTypes.Type(value = RefundReturnOutcome.class, name = "RefundReturnOutcome")
})
public interface ReturnOutcomeFinancialTransfer {
}
