package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Specifies the
 * [Urchin Traffic Module (UTM) parameters](https://en.wikipedia.org/wiki/UTM_parameters)
 * that are associated with a related marketing campaign.
 */
public class UTMInput {
  /**
   * The name of the UTM campaign.
   */
  private String campaign;

  /**
   * The name of the website or application where the referral link exists.
   */
  private String source;

  /**
   * The UTM campaign medium.
   */
  private String medium;

  public UTMInput() {
  }

  /**
   * The name of the UTM campaign.
   */
  public String getCampaign() {
    return campaign;
  }

  public void setCampaign(String campaign) {
    this.campaign = campaign;
  }

  /**
   * The name of the website or application where the referral link exists.
   */
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  /**
   * The UTM campaign medium.
   */
  public String getMedium() {
    return medium;
  }

  public void setMedium(String medium) {
    this.medium = medium;
  }

  @Override
  public String toString() {
    return "UTMInput{campaign='" + campaign + "', source='" + source + "', medium='" + medium + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UTMInput that = (UTMInput) o;
    return Objects.equals(campaign, that.campaign) &&
        Objects.equals(source, that.source) &&
        Objects.equals(medium, that.medium);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, source, medium);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the UTM campaign.
     */
    private String campaign;

    /**
     * The name of the website or application where the referral link exists.
     */
    private String source;

    /**
     * The UTM campaign medium.
     */
    private String medium;

    public UTMInput build() {
      UTMInput result = new UTMInput();
      result.campaign = this.campaign;
      result.source = this.source;
      result.medium = this.medium;
      return result;
    }

    /**
     * The name of the UTM campaign.
     */
    public Builder campaign(String campaign) {
      this.campaign = campaign;
      return this;
    }

    /**
     * The name of the website or application where the referral link exists.
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    /**
     * The UTM campaign medium.
     */
    public Builder medium(String medium) {
      this.medium = medium;
      return this;
    }
  }
}
