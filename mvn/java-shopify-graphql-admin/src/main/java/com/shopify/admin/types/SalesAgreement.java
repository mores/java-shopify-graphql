package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;
import java.time.OffsetDateTime;

/**
 * A contract between a merchant and a customer to do business. Shopify creates a
 * sales agreement whenever an order is placed, edited, or refunded. A sales
 * agreement has one or more sales records, which provide itemized details about
 * the initial agreement or subsequent changes made to the order. For example, when
 * a customer places an order, Shopify creates the order, generates a sales
 * agreement, and records a sale for each line item purchased in the order. A sale
 * record is specific to a type of order line. Order lines can represent different
 * things such as a purchased product, a tip added by a customer, shipping costs
 * collected at checkout, and more.
 */
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
  /**
   * The application that created the agreement.
   */
  App getApp();

  /**
   * The date and time at which the agreement occured.
   */
  OffsetDateTime getHappenedAt();

  /**
   * The unique ID for the agreement.
   */
  String getId();

  /**
   * The reason the agremeent was created.
   */
  OrderActionType getReason();

  /**
   * The sales associated with the agreement.
   */
  SaleConnection getSales();

  /**
   * The staff member associated with the agreement.
   */
  StaffMember getUser();
}
