package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a group of colors used together on a surface.
 */
public class CheckoutBrandingColorRolesInput {
  /**
   * The color of the background.
   */
  private String background;

  /**
   * The color of text.
   */
  private String text;

  /**
   * The color of borders.
   */
  private String border;

  /**
   * The color of icons.
   */
  private String icon;

  /**
   * The color of accented objects (links and focused state).
   */
  private String accent;

  /**
   * The decorative color for highlighting specific parts of the user interface.
   */
  private String decorative;

  public CheckoutBrandingColorRolesInput() {
  }

  /**
   * The color of the background.
   */
  public String getBackground() {
    return background;
  }

  public void setBackground(String background) {
    this.background = background;
  }

  /**
   * The color of text.
   */
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  /**
   * The color of borders.
   */
  public String getBorder() {
    return border;
  }

  public void setBorder(String border) {
    this.border = border;
  }

  /**
   * The color of icons.
   */
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  /**
   * The color of accented objects (links and focused state).
   */
  public String getAccent() {
    return accent;
  }

  public void setAccent(String accent) {
    this.accent = accent;
  }

  /**
   * The decorative color for highlighting specific parts of the user interface.
   */
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
    /**
     * The color of the background.
     */
    private String background;

    /**
     * The color of text.
     */
    private String text;

    /**
     * The color of borders.
     */
    private String border;

    /**
     * The color of icons.
     */
    private String icon;

    /**
     * The color of accented objects (links and focused state).
     */
    private String accent;

    /**
     * The decorative color for highlighting specific parts of the user interface.
     */
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

    /**
     * The color of the background.
     */
    public Builder background(String background) {
      this.background = background;
      return this;
    }

    /**
     * The color of text.
     */
    public Builder text(String text) {
      this.text = text;
      return this;
    }

    /**
     * The color of borders.
     */
    public Builder border(String border) {
      this.border = border;
      return this;
    }

    /**
     * The color of icons.
     */
    public Builder icon(String icon) {
      this.icon = icon;
      return this;
    }

    /**
     * The color of accented objects (links and focused state).
     */
    public Builder accent(String accent) {
      this.accent = accent;
      return this;
    }

    /**
     * The decorative color for highlighting specific parts of the user interface.
     */
    public Builder decorative(String decorative) {
      this.decorative = decorative;
      return this;
    }
  }
}
