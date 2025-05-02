package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Details about the gift card used on the checkout.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AppliedGiftCard implements com.shopify.storefront.types.Node {
  /**
   * The amount that was taken from the gift card by applying it.
   */
  private MoneyV2 amountUsed;

  /**
   * The amount that was taken from the gift card by applying it.
   */
  private MoneyV2 amountUsedV2;

  /**
   * The amount left on the gift card.
   */
  private MoneyV2 balance;

  /**
   * The amount left on the gift card.
   */
  private MoneyV2 balanceV2;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The last characters of the gift card.
   */
  private String lastCharacters;

  /**
   * The amount that was applied to the checkout in its currency.
   */
  private MoneyV2 presentmentAmountUsed;

  public AppliedGiftCard() {
  }

  /**
   * The amount that was taken from the gift card by applying it.
   */
  public MoneyV2 getAmountUsed() {
    return amountUsed;
  }

  public void setAmountUsed(MoneyV2 amountUsed) {
    this.amountUsed = amountUsed;
  }

  /**
   * The amount that was taken from the gift card by applying it.
   */
  public MoneyV2 getAmountUsedV2() {
    return amountUsedV2;
  }

  public void setAmountUsedV2(MoneyV2 amountUsedV2) {
    this.amountUsedV2 = amountUsedV2;
  }

  /**
   * The amount left on the gift card.
   */
  public MoneyV2 getBalance() {
    return balance;
  }

  public void setBalance(MoneyV2 balance) {
    this.balance = balance;
  }

  /**
   * The amount left on the gift card.
   */
  public MoneyV2 getBalanceV2() {
    return balanceV2;
  }

  public void setBalanceV2(MoneyV2 balanceV2) {
    this.balanceV2 = balanceV2;
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
   * The last characters of the gift card.
   */
  public String getLastCharacters() {
    return lastCharacters;
  }

  public void setLastCharacters(String lastCharacters) {
    this.lastCharacters = lastCharacters;
  }

  /**
   * The amount that was applied to the checkout in its currency.
   */
  public MoneyV2 getPresentmentAmountUsed() {
    return presentmentAmountUsed;
  }

  public void setPresentmentAmountUsed(MoneyV2 presentmentAmountUsed) {
    this.presentmentAmountUsed = presentmentAmountUsed;
  }

  @Override
  public String toString() {
    return "AppliedGiftCard{amountUsed='" + amountUsed + "', amountUsedV2='" + amountUsedV2 + "', balance='" + balance + "', balanceV2='" + balanceV2 + "', id='" + id + "', lastCharacters='" + lastCharacters + "', presentmentAmountUsed='" + presentmentAmountUsed + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppliedGiftCard that = (AppliedGiftCard) o;
    return Objects.equals(amountUsed, that.amountUsed) &&
        Objects.equals(amountUsedV2, that.amountUsedV2) &&
        Objects.equals(balance, that.balance) &&
        Objects.equals(balanceV2, that.balanceV2) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lastCharacters, that.lastCharacters) &&
        Objects.equals(presentmentAmountUsed, that.presentmentAmountUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountUsed, amountUsedV2, balance, balanceV2, id, lastCharacters, presentmentAmountUsed);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The amount that was taken from the gift card by applying it.
     */
    private MoneyV2 amountUsed;

    /**
     * The amount that was taken from the gift card by applying it.
     */
    private MoneyV2 amountUsedV2;

    /**
     * The amount left on the gift card.
     */
    private MoneyV2 balance;

    /**
     * The amount left on the gift card.
     */
    private MoneyV2 balanceV2;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The last characters of the gift card.
     */
    private String lastCharacters;

    /**
     * The amount that was applied to the checkout in its currency.
     */
    private MoneyV2 presentmentAmountUsed;

    public AppliedGiftCard build() {
      AppliedGiftCard result = new AppliedGiftCard();
      result.amountUsed = this.amountUsed;
      result.amountUsedV2 = this.amountUsedV2;
      result.balance = this.balance;
      result.balanceV2 = this.balanceV2;
      result.id = this.id;
      result.lastCharacters = this.lastCharacters;
      result.presentmentAmountUsed = this.presentmentAmountUsed;
      return result;
    }

    /**
     * The amount that was taken from the gift card by applying it.
     */
    public Builder amountUsed(MoneyV2 amountUsed) {
      this.amountUsed = amountUsed;
      return this;
    }

    /**
     * The amount that was taken from the gift card by applying it.
     */
    public Builder amountUsedV2(MoneyV2 amountUsedV2) {
      this.amountUsedV2 = amountUsedV2;
      return this;
    }

    /**
     * The amount left on the gift card.
     */
    public Builder balance(MoneyV2 balance) {
      this.balance = balance;
      return this;
    }

    /**
     * The amount left on the gift card.
     */
    public Builder balanceV2(MoneyV2 balanceV2) {
      this.balanceV2 = balanceV2;
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
     * The last characters of the gift card.
     */
    public Builder lastCharacters(String lastCharacters) {
      this.lastCharacters = lastCharacters;
      return this;
    }

    /**
     * The amount that was applied to the checkout in its currency.
     */
    public Builder presentmentAmountUsed(MoneyV2 presentmentAmountUsed) {
      this.presentmentAmountUsed = presentmentAmountUsed;
      return this;
    }
  }
}
