package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A shop's banner settings.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CookieBanner implements com.shopify.admin.types.HasPublishedTranslations {
  /**
   * Indicates if the banner is auto managed.
   */
  private boolean autoManaged;

  /**
   * Indicates if the banner is enabled.
   */
  private boolean enabled;

  /**
   * The published translations associated with the resource.
   */
  private List<Translation> translations;

  public CookieBanner() {
  }

  /**
   * Indicates if the banner is auto managed.
   */
  public boolean getAutoManaged() {
    return autoManaged;
  }

  public void setAutoManaged(boolean autoManaged) {
    this.autoManaged = autoManaged;
  }

  /**
   * Indicates if the banner is enabled.
   */
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * The published translations associated with the resource.
   */
  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  @Override
  public String toString() {
    return "CookieBanner{autoManaged='" + autoManaged + "', enabled='" + enabled + "', translations='" + translations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CookieBanner that = (CookieBanner) o;
    return autoManaged == that.autoManaged &&
        enabled == that.enabled &&
        Objects.equals(translations, that.translations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoManaged, enabled, translations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Indicates if the banner is auto managed.
     */
    private boolean autoManaged;

    /**
     * Indicates if the banner is enabled.
     */
    private boolean enabled;

    /**
     * The published translations associated with the resource.
     */
    private List<Translation> translations;

    public CookieBanner build() {
      CookieBanner result = new CookieBanner();
      result.autoManaged = this.autoManaged;
      result.enabled = this.enabled;
      result.translations = this.translations;
      return result;
    }

    /**
     * Indicates if the banner is auto managed.
     */
    public Builder autoManaged(boolean autoManaged) {
      this.autoManaged = autoManaged;
      return this;
    }

    /**
     * Indicates if the banner is enabled.
     */
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * The published translations associated with the resource.
     */
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }
  }
}
