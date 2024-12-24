package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SubscriptionBillingCycleEditedContract.class, name = "SubscriptionBillingCycleEditedContract"),
    @JsonSubTypes.Type(value = SubscriptionContract.class, name = "SubscriptionContract")
})
public interface SubscriptionContractBase {
  
  App getApp();

  
  String getAppAdminUrl();

  
  CurrencyCode getCurrencyCode();

  
  List<Attribute> getCustomAttributes();

  
  Customer getCustomer();

  
  CustomerPaymentMethod getCustomerPaymentMethod();

  
  SubscriptionDeliveryMethod getDeliveryMethod();

  
  MoneyV2 getDeliveryPrice();

  
  SubscriptionManualDiscountConnection getDiscounts();

  
  int getLineCount();

  
  SubscriptionLineConnection getLines();

  
  Count getLinesCount();

  
  String getNote();

  
  OrderConnection getOrders();

  
  OffsetDateTime getUpdatedAt();
}
