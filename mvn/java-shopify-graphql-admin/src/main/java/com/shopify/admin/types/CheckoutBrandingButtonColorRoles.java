package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Colors for buttons.
 */
public class CheckoutBrandingButtonColorRoles {
  /**
   * The color of accented objects (links and focused state).
   */
  private String accent;

  /**
   * The color of the background.
   */
  private String background;

  /**
   * The color of borders.
   */
  private String border;

  /**
   * The decorative color for highlighting specific parts of the user interface.
   */
  private String decorative;

  /**
   * The colors of the button on hover.
   */
  private CheckoutBrandingColorRoles hover;

  /**
   * The color of icons.
   */
  private String icon;

  /**
   * The color of text.
   */
  private String text;

  public CheckoutBrandingButtonColorRoles() {
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
   * The color of the background.
   */
  public String getBackground() {
    return background;
  }

  public void setBackground(String background) {
    this.background = background;
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
   * The decorative color for highlighting specific parts of the user interface.
   */
  public String getDecorative() {
    return decorative;
  }

  public void setDecorative(String decorative) {
    this.decorative = decorative;
  }

  /**
   * The colors of the button on hover.
   */
  public CheckoutBrandingColorRoles getHover() {
    return hover;
  }

  public void setHover(CheckoutBrandingColorRoles hover) {
    this.hover = hover;
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
   * The color of text.
   */
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingButtonColorRoles{accent='" + accent + "', background='" + background + "', border='" + border + "', decorative='" + decorative + "', hover='" + hover + "', icon='" + icon + "', text='" + text + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingButtonColorRoles that = (CheckoutBrandingButtonColorRoles) o;
    return Objects.equals(accent, that.accent) &&
        Objects.equals(background, that.background) &&
        Objects.equals(border, that.border) &&
        Objects.equals(decorative, that.decorative) &&
        Objects.equals(hover, that.hover) &&
        Objects.equals(icon, that.icon) &&
        Objects.equals(text, that.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accent, background, border, decorative, hover, icon, text);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The color of accented objects (links and focused state).
     */
    private String accent;

    /**
     * The color of the background.
     */
    private String background;

    /**
     * The color of borders.
     */
    private String border;

    /**
     * The decorative color for highlighting specific parts of the user interface.
     */
    private String decorative;

    /**
     * The colors of the button on hover.
     */
    private CheckoutBrandingColorRoles hover;

    /**
     * The color of icons.
     */
    private String icon;

    /**
     * The color of text.
     */
    private String text;

    public CheckoutBrandingButtonColorRoles build() {
      CheckoutBrandingButtonColorRoles result = new CheckoutBrandingButtonColorRoles();
      result.accent = this.accent;
      result.background = this.background;
      result.border = this.border;
      result.decorative = this.decorative;
      result.hover = this.hover;
      result.icon = this.icon;
      result.text = this.text;
      return result;
    }

    /**
     * The color of accented objects (links and focused state).
     */
    public Builder accent(String accent) {
      this.accent = accent;
      return this;
    }

    /**
     * The color of the background.
     */
    public Builder background(String background) {
      this.background = background;
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
     * The decorative color for highlighting specific parts of the user interface.
     */
    public Builder decorative(String decorative) {
      this.decorative = decorative;
      return this;
    }

    /**
     * The colors of the button on hover.
     */
    public Builder hover(CheckoutBrandingColorRoles hover) {
      this.hover = hover;
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
     * The color of text.
     */
    public Builder text(String text) {
      this.text = text;
      return this;
    }
  }
}
