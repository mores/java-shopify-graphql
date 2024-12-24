package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingColorRolesInput {
  
  private String background;

  
  private String text;

  
  private String border;

  
  private String icon;

  
  private String accent;

  
  private String decorative;

  public CheckoutBrandingColorRolesInput() {
  }

  
  public String getBackground() {
    return background;
  }

  public void setBackground(String background) {
    this.background = background;
  }

  
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  
  public String getBorder() {
    return border;
  }

  public void setBorder(String border) {
    this.border = border;
  }

  
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  
  public String getAccent() {
    return accent;
  }

  public void setAccent(String accent) {
    this.accent = accent;
  }

  
  public String getDecorative() {
    return decorative;
  }

  public void setDecorative(String decorative) {
    this.decorative = decorative;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingColorRolesInput{background='" + background + "', text='" + text + "', border='" + border + "', icon='" + icon + "', accent='" + accent + "', decorative='" + decorative + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingColorRolesInput that = (CheckoutBrandingColorRolesInput) o;
    return Objects.equals(background, that.background) &&
        Objects.equals(text, that.text) &&
        Objects.equals(border, that.border) &&
        Objects.equals(icon, that.icon) &&
        Objects.equals(accent, that.accent) &&
        Objects.equals(decorative, that.decorative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(background, text, border, icon, accent, decorative);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String background;

    
    private String text;

    
    private String border;

    
    private String icon;

    
    private String accent;

    
    private String decorative;

    public CheckoutBrandingColorRolesInput build() {
      CheckoutBrandingColorRolesInput result = new CheckoutBrandingColorRolesInput();
      result.background = this.background;
      result.text = this.text;
      result.border = this.border;
      result.icon = this.icon;
      result.accent = this.accent;
      result.decorative = this.decorative;
      return result;
    }

    
    public Builder background(String background) {
      this.background = background;
      return this;
    }

    
    public Builder text(String text) {
      this.text = text;
      return this;
    }

    
    public Builder border(String border) {
      this.border = border;
      return this;
    }

    
    public Builder icon(String icon) {
      this.icon = icon;
      return this;
    }

    
    public Builder accent(String accent) {
      this.accent = accent;
      return this;
    }

    
    public Builder decorative(String decorative) {
      this.decorative = decorative;
      return this;
    }
  }
}
