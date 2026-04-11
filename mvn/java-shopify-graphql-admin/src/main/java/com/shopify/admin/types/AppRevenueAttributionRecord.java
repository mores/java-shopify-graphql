package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Tracks revenue that was captured outside of Shopify's billing system but needs
 * to be attributed to the app for comprehensive revenue reporting and partner
 * analytics. This object enables accurate revenue tracking when apps process
 * payments through external systems while maintaining visibility into total app performance.
 *
 * External revenue attribution is essential for apps that offer multiple payment
 * channels or process certain transactions outside Shopify's billing
 * infrastructure. For example, an enterprise app might process large custom
 * contracts through external payment processors, or a marketplace app could handle
 * direct merchant-to-merchant transactions that still generate app commissions.
 *
 * Use the `AppRevenueAttributionRecord` object to:
 * - Report revenue from external payment processors and billing systems
 * - Track commission-based earnings from marketplace or referral activities
 * - Maintain comprehensive revenue analytics across multiple payment channels
 * - Ensure accurate partner revenue sharing and commission calculations
 * - Generate complete financial reports that include all app-generated revenue streams
 * - Support compliance requirements for external revenue documentation
 *
 * Each attribution record includes the captured amount, external transaction
 * timestamp, and idempotency keys to prevent duplicate reporting. The record type
 * field categorizes different revenue streams, enabling detailed analytics and
 * reporting segmentation.
 *
 * Revenue attribution records are particularly important for apps participating in
 * Shopify's partner program, as they ensure accurate revenue sharing calculations
 * and comprehensive performance metrics. The captured timestamp reflects when the
 * external payment was processed, not when the attribution record was created in Shopify.
 *
 * For detailed revenue attribution values, see the [AppRevenueAttributionType enum](https://shopify.dev/docs/api/admin-graphql/latest/enums/AppRevenueAttributionType).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AppRevenueAttributionRecord implements com.shopify.admin.types.Node {
  /**
   * The financial amount captured in this attribution.
   */
  private MoneyV2 amount;

  /**
   * The timestamp when the financial amount was captured.
   */
  private OffsetDateTime capturedAt;

  /**
   * The timestamp at which this revenue attribution was issued.
   */
  private OffsetDateTime createdAt;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The unique value submitted during the creation of the app revenue attribution record.
   * For more information, refer to
   * [Idempotent requests](https://shopify.dev/api/usage/idempotent-requests).
   */
  private String idempotencyKey;

  /**
   * Indicates whether this is a test submission.
   */
  private boolean test;

  /**
   * The type of revenue attribution.
   */
  private AppRevenueAttributionType type;

  public AppRevenueAttributionRecord() {
  }

  /**
   * The financial amount captured in this attribution.
   */
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  /**
   * The timestamp when the financial amount was captured.
   */
  public OffsetDateTime getCapturedAt() {
    return capturedAt;
  }

  public void setCapturedAt(OffsetDateTime capturedAt) {
    this.capturedAt = capturedAt;
  }

  /**
   * The timestamp at which this revenue attribution was issued.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The unique value submitted during the creation of the app revenue attribution record.
   * For more information, refer to
   * [Idempotent requests](https://shopify.dev/api/usage/idempotent-requests).
   */
  public String getIdempotencyKey() {
    return idempotencyKey;
  }

  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }

  /**
   * Indicates whether this is a test submission.
   */
  public boolean getTest() {
    return test;
  }

  public void setTest(boolean test) {
    this.test = test;
  }

  /**
   * The type of revenue attribution.
   */
  public AppRevenueAttributionType getType() {
    return type;
  }

  public void setType(AppRevenueAttributionType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "AppRevenueAttributionRecord{amount='" + amount + "', capturedAt='" + capturedAt + "', createdAt='" + createdAt + "', id='" + id + "', idempotencyKey='" + idempotencyKey + "', test='" + test + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppRevenueAttributionRecord that = (AppRevenueAttributionRecord) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(capturedAt, that.capturedAt) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(idempotencyKey, that.idempotencyKey) &&
        test == that.test &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, capturedAt, createdAt, id, idempotencyKey, test, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The financial amount captured in this attribution.
     */
    private MoneyV2 amount;

    /**
     * The timestamp when the financial amount was captured.
     */
    private OffsetDateTime capturedAt;

    /**
     * The timestamp at which this revenue attribution was issued.
     */
    private OffsetDateTime createdAt;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The unique value submitted during the creation of the app revenue attribution record.
     * For more information, refer to
     * [Idempotent requests](https://shopify.dev/api/usage/idempotent-requests).
     */
    private String idempotencyKey;

    /**
     * Indicates whether this is a test submission.
     */
    private boolean test;

    /**
     * The type of revenue attribution.
     */
    private AppRevenueAttributionType type;

    public AppRevenueAttributionRecord build() {
      AppRevenueAttributionRecord result = new AppRevenueAttributionRecord();
      result.amount = this.amount;
      result.capturedAt = this.capturedAt;
      result.createdAt = this.createdAt;
      result.id = this.id;
      result.idempotencyKey = this.idempotencyKey;
      result.test = this.test;
      result.type = this.type;
      return result;
    }

    /**
     * The financial amount captured in this attribution.
     */
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The timestamp when the financial amount was captured.
     */
    public Builder capturedAt(OffsetDateTime capturedAt) {
      this.capturedAt = capturedAt;
      return this;
    }

    /**
     * The timestamp at which this revenue attribution was issued.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The unique value submitted during the creation of the app revenue attribution record.
     * For more information, refer to
     * [Idempotent requests](https://shopify.dev/api/usage/idempotent-requests).
     */
    public Builder idempotencyKey(String idempotencyKey) {
      this.idempotencyKey = idempotencyKey;
      return this;
    }

    /**
     * Indicates whether this is a test submission.
     */
    public Builder test(boolean test) {
      this.test = test;
      return this;
    }

    /**
     * The type of revenue attribution.
     */
    public Builder type(AppRevenueAttributionType type) {
      this.type = type;
      return this;
    }
  }
}
