package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;
import java.time.OffsetDateTime;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = OrderAgreement.class, name = "OrderAgreement"),
    @JsonSubTypes.Type(value = OrderEditAgreement.class, name = "OrderEditAgreement"),
    @JsonSubTypes.Type(value = RefundAgreement.class, name = "RefundAgreement"),
    @JsonSubTypes.Type(value = ReturnAgreement.class, name = "ReturnAgreement")
})
public interface SalesAgreement {
  
  App getApp();

  
  OffsetDateTime getHappenedAt();

  
  String getId();

  
  OrderActionType getReason();

  
  SaleConnection getSales();

  
  StaffMember getUser();
}
