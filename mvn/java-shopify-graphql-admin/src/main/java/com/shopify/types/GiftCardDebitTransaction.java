package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A debit transaction which decreases the gift card balance.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class GiftCardDebitTransaction implements com.shopify.types.GiftCardTransaction, com.shopify.types.HasMetafields, com.shopify.types.Node {
  /**
   * The amount of the transaction.
   */
  private MoneyV2 amount;

  /**
   * The gift card that the transaction belongs to.
   */
  private GiftCard giftCard;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  private MetafieldConnection metafields;

  /**
   * A note about the transaction.
   */
  private String note;

  /**
   * Returns a private metafield by namespace and key that belongs to the resource.
   */
  private PrivateMetafield privateMetafield;

  /**
   * List of private metafields that belong to the resource.
   */
  private PrivateMetafieldConnection privateMetafields;

  /**
   * The date and time when the transaction was processed.
   */
  private OffsetDateTime processedAt;

  public GiftCardDebitTransaction() {
  }

  /**
   * The amount of the transaction.
   */
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  /**
   * The gift card that the transaction belongs to.
   */
  public GiftCard getGiftCard() {
    return giftCard;
  }

  public void setGiftCard(GiftCard giftCard) {
    this.giftCard = giftCard;
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
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  /**
   * A note about the transaction.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * Returns a private metafield by namespace and key that belongs to the resource.
   */
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  /**
   * List of private metafields that belong to the resource.
   */
  public PrivateMetafieldConnection getPrivateMetafields() {
    return privateMetafields;
  }

  public void setPrivateMetafields(PrivateMetafieldConnection privateMetafields) {
    this.privateMetafields = privateMetafields;
  }

  /**
   * The date and time when the transaction was processed.
   */
  public OffsetDateTime getProcessedAt() {
    return processedAt;
  }

  public void setProcessedAt(OffsetDateTime processedAt) {
    this.processedAt = processedAt;
  }

  @Override
  public String toString() {
    return "GiftCardDebitTransaction{amount='" + amount + "', giftCard='" + giftCard + "', id='" + id + "', metafield='" + metafield + "', metafields='" + metafields + "', note='" + note + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', processedAt='" + processedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardDebitTransaction that = (GiftCardDebitTransaction) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(giftCard, that.giftCard) &&
        Objects.equals(id, that.id) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(note, that.note) &&
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
        Objects.equals(processedAt, that.processedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, giftCard, id, metafield, metafields, note, privateMetafield, privateMetafields, processedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The amount of the transaction.
     */
    private MoneyV2 amount;

    /**
     * The gift card that the transaction belongs to.
     */
    private GiftCard giftCard;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    private MetafieldConnection metafields;

    /**
     * A note about the transaction.
     */
    private String note;

    /**
     * Returns a private metafield by namespace and key that belongs to the resource.
     */
    private PrivateMetafield privateMetafield;

    /**
     * List of private metafields that belong to the resource.
     */
    private PrivateMetafieldConnection privateMetafields;

    /**
     * The date and time when the transaction was processed.
     */
    private OffsetDateTime processedAt;

    public GiftCardDebitTransaction build() {
      GiftCardDebitTransaction result = new GiftCardDebitTransaction();
      result.amount = this.amount;
      result.giftCard = this.giftCard;
      result.id = this.id;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      result.note = this.note;
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
      result.processedAt = this.processedAt;
      return result;
    }

    /**
     * The amount of the transaction.
     */
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The gift card that the transaction belongs to.
     */
    public Builder giftCard(GiftCard giftCard) {
      this.giftCard = giftCard;
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
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * A note about the transaction.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * Returns a private metafield by namespace and key that belongs to the resource.
     */
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    /**
     * List of private metafields that belong to the resource.
     */
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }

    /**
     * The date and time when the transaction was processed.
     */
    public Builder processedAt(OffsetDateTime processedAt) {
      this.processedAt = processedAt;
      return this;
    }
  }
}
