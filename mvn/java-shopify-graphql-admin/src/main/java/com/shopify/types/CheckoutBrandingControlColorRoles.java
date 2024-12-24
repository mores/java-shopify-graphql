package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingControlColorRoles {
  
  private String accent;

  
  private String background;

  
  private String border;

  
  private String decorative;

  
  private String icon;

  
  private CheckoutBrandingColorRoles selected;

  
  private String text;

  public CheckoutBrandingControlColorRoles() {
  }

  
  public String getAccent() {
    return accent;
  }

  public void setAccent(String accent) {
    this.accent = accent;
  }

  
  public String getBackground() {
    return background;
  }

  public void setBackground(String background) {
    this.background = background;
  }

  
  public String getBorder() {
    return border;
  }

  public void setBorder(String border) {
    this.border = border;
  }

  
  public String getDecorative() {
    return decorative;
  }

  public void setDecorative(String decorative) {
    this.decorative = decorative;
  }

  
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  
  public CheckoutBrandingColorRoles getSelected() {
    return selected;
  }

  public void setSelected(CheckoutBrandingColorRoles selected) {
    this.selected = selected;
  }

  
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingControlColorRoles{accent='" + accent + "', background='" + background + "', border='" + border + "', decorative='" + decorative + "', icon='" + icon + "', selected='" + selected + "', text='" + text + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingControlColorRoles that = (CheckoutBrandingControlColorRoles) o;
    return Objects.equals(accent, that.accent) &&
        Objects.equals(background, that.background) &&
        Objects.equals(border, that.border) &&
        Objects.equals(decorative, that.decorative) &&
        Objects.equals(icon, that.icon) &&
        Objects.equals(selected, that.selected) &&
        Objects.equals(text, that.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accent, background, border, decorative, icon, selected, text);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String accent;

    
    private String background;

    
    private String border;

    
    private String decorative;

    
    private String icon;

    
    private CheckoutBrandingColorRoles selected;

    
    private String text;

    public CheckoutBrandingControlColorRoles build() {
      CheckoutBrandingControlColorRoles result = new CheckoutBrandingControlColorRoles();
      result.accent = this.accent;
      result.background = this.background;
      result.border = this.border;
      result.decorative = this.decorative;
      result.icon = this.icon;
      result.selected = this.selected;
      result.text = this.text;
      return result;
    }

    
    public Builder accent(String accent) {
      this.accent = accent;
      return this;
    }

    
    public Builder background(String background) {
      this.background = background;
      return this;
    }

    
    public Builder border(String border) {
      this.border = border;
      return this;
    }

    
    public Builder decorative(String decorative) {
      this.decorative = decorative;
      return this;
    }

    
    public Builder icon(String icon) {
      this.icon = icon;
      return this;
    }

    
    public Builder selected(CheckoutBrandingColorRoles selected) {
      this.selected = selected;
      return this;
    }

    
    public Builder text(String text) {
      this.text = text;
      return this;
    }
  }
}
