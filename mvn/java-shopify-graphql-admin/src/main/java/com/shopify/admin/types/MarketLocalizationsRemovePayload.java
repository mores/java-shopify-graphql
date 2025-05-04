package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `marketLocalizationsRemove` mutation.
 */
public class MarketLocalizationsRemovePayload {
  /**
   * The market localizations that were deleted.
   */
  private List<MarketLocalization> marketLocalizations;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<TranslationUserError> userErrors;

  public MarketLocalizationsRemovePayload() {
  }

  /**
   * The market localizations that were deleted.
   */
  public List<MarketLocalization> getMarketLocalizations() {
    return marketLocalizations;
  }

  public void setMarketLocalizations(List<MarketLocalization> marketLocalizations) {
    this.marketLocalizations = marketLocalizations;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<TranslationUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<TranslationUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MarketLocalizationsRemovePayload{marketLocalizations='" + marketLocalizations + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketLocalizationsRemovePayload that = (MarketLocalizationsRemovePayload) o;
    return Objects.equals(marketLocalizations, that.marketLocalizations) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketLocalizations, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The market localizations that were deleted.
     */
    private List<MarketLocalization> marketLocalizations;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<TranslationUserError> userErrors;

    public MarketLocalizationsRemovePayload build() {
      MarketLocalizationsRemovePayload result = new MarketLocalizationsRemovePayload();
      result.marketLocalizations = this.marketLocalizations;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The market localizations that were deleted.
     */
    public Builder marketLocalizations(List<MarketLocalization> marketLocalizations) {
      this.marketLocalizations = marketLocalizations;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<TranslationUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
