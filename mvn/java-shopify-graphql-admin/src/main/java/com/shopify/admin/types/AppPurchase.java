package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;
import java.time.OffsetDateTime;

/**
 * Services and features purchased once by the store.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes(@JsonSubTypes.Type(value = AppPurchaseOneTime.class, name = "AppPurchaseOneTime"))
public interface AppPurchase {
  /**
   * The date and time when the app purchase occurred.
   */
  OffsetDateTime getCreatedAt();

  /**
   * The name of the app purchase.
   */
  String getName();

  /**
   * The amount to be charged to the store for the app purchase.
   */
  MoneyV2 getPrice();

  /**
   * The status of the app purchase.
   */
  AppPurchaseStatus getStatus();

  /**
   * Whether the app purchase is a test transaction.
   */
  boolean getTest();
}
