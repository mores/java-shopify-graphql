package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a set of UTM parameters.
 */
public class UTMParameters {
  /**
   * The name of a marketing campaign.
   */
  private String campaign;

  /**
   * Identifies specific content in a marketing campaign. Used to differentiate
   * between similar content or links in a marketing campaign to determine which is
   * the most effective.
   */
  private String content;

  /**
   * The medium of a marketing campaign, such as a banner or email newsletter.
   */
  private String medium;

  /**
   * The source of traffic to the merchant's store, such as Google or an email newsletter.
   */
  private String source;

  /**
   * Paid search terms used by a marketing campaign.
   */
  private String term;

  public UTMParameters() {
  }

  /**
   * The name of a marketing campaign.
   */
  public String getCampaign() {
    return campaign;
  }

  public void setCampaign(String campaign) {
    this.campaign = campaign;
  }

  /**
   * Identifies specific content in a marketing campaign. Used to differentiate
   * between similar content or links in a marketing campaign to determine which is
   * the most effective.
   */
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  /**
   * The medium of a marketing campaign, such as a banner or email newsletter.
   */
  public String getMedium() {
    return medium;
  }

  public void setMedium(String medium) {
    this.medium = medium;
  }

  /**
   * The source of traffic to the merchant's store, such as Google or an email newsletter.
   */
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  /**
   * Paid search terms used by a marketing campaign.
   */
  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }

  @Override
  public String toString() {
    return "UTMParameters{campaign='" + campaign + "', content='" + content + "', medium='" + medium + "', source='" + source + "', term='" + term + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UTMParameters that = (UTMParameters) o;
    return Objects.equals(campaign, that.campaign) &&
        Objects.equals(content, that.content) &&
        Objects.equals(medium, that.medium) &&
        Objects.equals(source, that.source) &&
        Objects.equals(term, that.term);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, content, medium, source, term);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of a marketing campaign.
     */
    private String campaign;

    /**
     * Identifies specific content in a marketing campaign. Used to differentiate
     * between similar content or links in a marketing campaign to determine which is
     * the most effective.
     */
    private String content;

    /**
     * The medium of a marketing campaign, such as a banner or email newsletter.
     */
    private String medium;

    /**
     * The source of traffic to the merchant's store, such as Google or an email newsletter.
     */
    private String source;

    /**
     * Paid search terms used by a marketing campaign.
     */
    private String term;

    public UTMParameters build() {
      UTMParameters result = new UTMParameters();
      result.campaign = this.campaign;
      result.content = this.content;
      result.medium = this.medium;
      result.source = this.source;
      result.term = this.term;
      return result;
    }

    /**
     * The name of a marketing campaign.
     */
    public Builder campaign(String campaign) {
      this.campaign = campaign;
      return this;
    }

    /**
     * Identifies specific content in a marketing campaign. Used to differentiate
     * between similar content or links in a marketing campaign to determine which is
     * the most effective.
     */
    public Builder content(String content) {
      this.content = content;
      return this;
    }

    /**
     * The medium of a marketing campaign, such as a banner or email newsletter.
     */
    public Builder medium(String medium) {
      this.medium = medium;
      return this;
    }

    /**
     * The source of traffic to the merchant's store, such as Google or an email newsletter.
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    /**
     * Paid search terms used by a marketing campaign.
     */
    public Builder term(String term) {
      this.term = term;
      return this;
    }
  }
}
