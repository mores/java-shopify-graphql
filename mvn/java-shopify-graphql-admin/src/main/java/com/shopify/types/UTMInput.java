package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class UTMInput {
  
  private String campaign;

  
  private String source;

  
  private String medium;

  public UTMInput() {
  }

  
  public String getCampaign() {
    return campaign;
  }

  public void setCampaign(String campaign) {
    this.campaign = campaign;
  }

  
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  
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
    
    private String campaign;

    
    private String source;

    
    private String medium;

    public UTMInput build() {
      UTMInput result = new UTMInput();
      result.campaign = this.campaign;
      result.source = this.source;
      result.medium = this.medium;
      return result;
    }

    
    public Builder campaign(String campaign) {
      this.campaign = campaign;
      return this;
    }

    
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    
    public Builder medium(String medium) {
      this.medium = medium;
      return this;
    }
  }
}
