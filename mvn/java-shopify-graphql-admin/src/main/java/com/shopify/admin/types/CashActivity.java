package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;

/**
 * An activity on a cash drawer.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CashAdjustmentActivity.class, name = "CashAdjustmentActivity"),
    @JsonSubTypes.Type(value = CashCountActivity.class, name = "CashCountActivity"),
    @JsonSubTypes.Type(value = CashTransactionActivity.class, name = "CashTransactionActivity")
})
public interface CashActivity {
  /**
   * The amount of cash added or removed as part of the activity.
   */
  MoneyV2 getCash();

  /**
   * The point of sale device payment session associated with the activity.
   */
  PointOfSaleDevicePaymentSession getPaymentSession();

  /**
   * The staff member who performed the activity.
   */
  StaffMember getStaffMember();

  /**
   * The time at which the activity occurred.
   */
  OffsetDateTime getTime();
}
