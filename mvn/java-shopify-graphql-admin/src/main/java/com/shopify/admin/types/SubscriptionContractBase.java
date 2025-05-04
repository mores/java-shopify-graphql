package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Represents subscription contract common fields.
 */
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
  /**
   * The subscription app that the subscription contract is registered to.
   */
  App getApp();

  /**
   * The URL of the subscription contract page on the subscription app.
   */
  String getAppAdminUrl();

  /**
   * The currency that's used for the subscription contract.
   */
  CurrencyCode getCurrencyCode();

  /**
   * A list of the custom attributes to be added to the generated orders.
   */
  List<Attribute> getCustomAttributes();

  /**
   * The customer to whom the subscription contract belongs.
   */
  Customer getCustomer();

  /**
   * The customer payment method that's used for the subscription contract.
   */
  CustomerPaymentMethod getCustomerPaymentMethod();

  /**
   * The delivery method for each billing of the subscription contract.
   */
  SubscriptionDeliveryMethod getDeliveryMethod();

  /**
   * The delivery price for each billing of the subscription contract.
   */
  MoneyV2 getDeliveryPrice();

  /**
   * The list of subscription discounts associated with the subscription contract.
   */
  SubscriptionManualDiscountConnection getDiscounts();

  /**
   * The number of lines associated with the subscription contract.
   */
  int getLineCount();

  /**
   * The list of subscription lines associated with the subscription contract.
   */
  SubscriptionLineConnection getLines();

  /**
   * The number of lines associated with the subscription contract.
   */
  Count getLinesCount();

  /**
   * The note field that will be applied to the generated orders.
   */
  String getNote();

  /**
   * A list of the subscription contract's orders.
   */
  OrderConnection getOrders();

  /**
   * The date and time when the subscription contract was updated.
   */
  OffsetDateTime getUpdatedAt();
}
