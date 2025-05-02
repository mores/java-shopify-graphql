package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A search query suggestion.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SearchQuerySuggestion implements com.shopify.types.Trackable {
  /**
   * The text of the search query suggestion with highlighted HTML tags.
   */
  private String styledText;

  /**
   * The text of the search query suggestion.
   */
  private String text;

  /**
   * URL parameters to be added to a page URL to track the origin of on-site search
   * traffic for [analytics reporting](https://help.shopify.com/manual/reports-and-analytics/shopify-reports/report-types/default-reports/behaviour-reports).
   * Returns a result when accessed through the
   * [search](https://shopify.dev/docs/api/storefront/current/queries/search) or [predictiveSearch](https://shopify.dev/docs/api/storefront/current/queries/predictiveSearch)
   * queries, otherwise returns null.
   */
  private String trackingParameters;

  public SearchQuerySuggestion() {
  }

  /**
   * The text of the search query suggestion with highlighted HTML tags.
   */
  public String getStyledText() {
    return styledText;
  }

  public void setStyledText(String styledText) {
    this.styledText = styledText;
  }

  /**
   * The text of the search query suggestion.
   */
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  /**
   * URL parameters to be added to a page URL to track the origin of on-site search
   * traffic for [analytics reporting](https://help.shopify.com/manual/reports-and-analytics/shopify-reports/report-types/default-reports/behaviour-reports).
   * Returns a result when accessed through the
   * [search](https://shopify.dev/docs/api/storefront/current/queries/search) or [predictiveSearch](https://shopify.dev/docs/api/storefront/current/queries/predictiveSearch)
   * queries, otherwise returns null.
   */
  public String getTrackingParameters() {
    return trackingParameters;
  }

  public void setTrackingParameters(String trackingParameters) {
    this.trackingParameters = trackingParameters;
  }

  @Override
  public String toString() {
    return "SearchQuerySuggestion{styledText='" + styledText + "', text='" + text + "', trackingParameters='" + trackingParameters + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchQuerySuggestion that = (SearchQuerySuggestion) o;
    return Objects.equals(styledText, that.styledText) &&
        Objects.equals(text, that.text) &&
        Objects.equals(trackingParameters, that.trackingParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(styledText, text, trackingParameters);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The text of the search query suggestion with highlighted HTML tags.
     */
    private String styledText;

    /**
     * The text of the search query suggestion.
     */
    private String text;

    /**
     * URL parameters to be added to a page URL to track the origin of on-site search
     * traffic for [analytics reporting](https://help.shopify.com/manual/reports-and-analytics/shopify-reports/report-types/default-reports/behaviour-reports).
     * Returns a result when accessed through the
     * [search](https://shopify.dev/docs/api/storefront/current/queries/search) or [predictiveSearch](https://shopify.dev/docs/api/storefront/current/queries/predictiveSearch)
     * queries, otherwise returns null.
     */
    private String trackingParameters;

    public SearchQuerySuggestion build() {
      SearchQuerySuggestion result = new SearchQuerySuggestion();
      result.styledText = this.styledText;
      result.text = this.text;
      result.trackingParameters = this.trackingParameters;
      return result;
    }

    /**
     * The text of the search query suggestion with highlighted HTML tags.
     */
    public Builder styledText(String styledText) {
      this.styledText = styledText;
      return this;
    }

    /**
     * The text of the search query suggestion.
     */
    public Builder text(String text) {
      this.text = text;
      return this;
    }

    /**
     * URL parameters to be added to a page URL to track the origin of on-site search
     * traffic for [analytics reporting](https://help.shopify.com/manual/reports-and-analytics/shopify-reports/report-types/default-reports/behaviour-reports).
     * Returns a result when accessed through the
     * [search](https://shopify.dev/docs/api/storefront/current/queries/search) or [predictiveSearch](https://shopify.dev/docs/api/storefront/current/queries/predictiveSearch)
     * queries, otherwise returns null.
     */
    public Builder trackingParameters(String trackingParameters) {
      this.trackingParameters = trackingParameters;
      return this;
    }
  }
}
