package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class UTMParameters {
  
  private String campaign;

  
  private String content;

  
  private String medium;

  
  private String source;

  
  private String term;

  public UTMParameters() {
  }

  
  public String getCampaign() {
    return campaign;
  }

  public void setCampaign(String campaign) {
    this.campaign = campaign;
  }

  
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  
  public String getMedium() {
    return medium;
  }

  public void setMedium(String medium) {
    this.medium = medium;
  }

  
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  
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
    
    private String campaign;

    
    private String content;

    
    private String medium;

    
    private String source;

    
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

    
    public Builder campaign(String campaign) {
      this.campaign = campaign;
      return this;
    }

    
    public Builder content(String content) {
      this.content = content;
      return this;
    }

    
    public Builder medium(String medium) {
      this.medium = medium;
      return this;
    }

    
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    
    public Builder term(String term) {
      this.term = term;
      return this;
    }
  }
}
