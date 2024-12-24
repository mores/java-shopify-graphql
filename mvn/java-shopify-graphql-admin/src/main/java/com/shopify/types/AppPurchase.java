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
@JsonSubTypes(@JsonSubTypes.Type(value = AppPurchaseOneTime.class, name = "AppPurchaseOneTime"))
public interface AppPurchase {
  
  OffsetDateTime getCreatedAt();

  
  String getName();

  
  MoneyV2 getPrice();

  
  AppPurchaseStatus getStatus();

  
  boolean getTest();
}
