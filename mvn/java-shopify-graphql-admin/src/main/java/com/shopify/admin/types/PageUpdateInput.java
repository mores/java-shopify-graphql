package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to update a page.
 */
public class PageUpdateInput {
  /**
   * A unique, human-friendly string for the page. If no handle is specified, a
   * handle will be generated automatically from the page title.
   * In themes, the Liquid templating language refers to a page by its handle.
   */
  private String handle;

  /**
   * The text content of the page, complete with HTML markup.
   */
  private String body;

  /**
   * Whether or not the page should be visible. Defaults to `true` if no publish date is specified.
   */
  private Boolean isPublished;

  /**
   * The date and time (ISO 8601 format) when the page should become visible.
   */
  private OffsetDateTime publishDate;

  /**
   * The suffix of the template that's used to render the page.
   * If the value is an empty string or `null`, then the default page template is used.
   */
  private String templateSuffix;

  /**
   * The input fields to create or update a metafield.
   */
  private List<MetafieldInput> metafields;

  /**
   * The title of the page.
   */
  private String title;

  /**
   * Whether a redirect is required after a new handle has been provided.
   * If `true`, then the old handle is redirected to the new one automatically.
   */
  private Boolean redirectNewHandle = false;

  public PageUpdateInput() {
  }

  /**
   * A unique, human-friendly string for the page. If no handle is specified, a
   * handle will be generated automatically from the page title.
   * In themes, the Liquid templating language refers to a page by its handle.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * The text content of the page, complete with HTML markup.
   */
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  /**
   * Whether or not the page should be visible. Defaults to `true` if no publish date is specified.
   */
  public Boolean getIsPublished() {
    return isPublished;
  }

  public void setIsPublished(Boolean isPublished) {
    this.isPublished = isPublished;
  }

  /**
   * The date and time (ISO 8601 format) when the page should become visible.
   */
  public OffsetDateTime getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(OffsetDateTime publishDate) {
    this.publishDate = publishDate;
  }

  /**
   * The suffix of the template that's used to render the page.
   * If the value is an empty string or `null`, then the default page template is used.
   */
  public String getTemplateSuffix() {
    return templateSuffix;
  }

  public void setTemplateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
  }

  /**
   * The input fields to create or update a metafield.
   */
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  /**
   * The title of the page.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Whether a redirect is required after a new handle has been provided.
   * If `true`, then the old handle is redirected to the new one automatically.
   */
  public Boolean getRedirectNewHandle() {
    return redirectNewHandle;
  }

  public void setRedirectNewHandle(Boolean redirectNewHandle) {
    this.redirectNewHandle = redirectNewHandle;
  }

  @Override
  public String toString() {
    return "PageUpdateInput{handle='" + handle + "', body='" + body + "', isPublished='" + isPublished + "', publishDate='" + publishDate + "', templateSuffix='" + templateSuffix + "', metafields='" + metafields + "', title='" + title + "', redirectNewHandle='" + redirectNewHandle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PageUpdateInput that = (PageUpdateInput) o;
    return Objects.equals(handle, that.handle) &&
        Objects.equals(body, that.body) &&
        Objects.equals(isPublished, that.isPublished) &&
        Objects.equals(publishDate, that.publishDate) &&
        Objects.equals(templateSuffix, that.templateSuffix) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(title, that.title) &&
        Objects.equals(redirectNewHandle, that.redirectNewHandle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, body, isPublished, publishDate, templateSuffix, metafields, title, redirectNewHandle);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A unique, human-friendly string for the page. If no handle is specified, a
     * handle will be generated automatically from the page title.
     * In themes, the Liquid templating language refers to a page by its handle.
     */
    private String handle;

    /**
     * The text content of the page, complete with HTML markup.
     */
    private String body;

    /**
     * Whether or not the page should be visible. Defaults to `true` if no publish date is specified.
     */
    private Boolean isPublished;

    /**
     * The date and time (ISO 8601 format) when the page should become visible.
     */
    private OffsetDateTime publishDate;

    /**
     * The suffix of the template that's used to render the page.
     * If the value is an empty string or `null`, then the default page template is used.
     */
    private String templateSuffix;

    /**
     * The input fields to create or update a metafield.
     */
    private List<MetafieldInput> metafields;

    /**
     * The title of the page.
     */
    private String title;

    /**
     * Whether a redirect is required after a new handle has been provided.
     * If `true`, then the old handle is redirected to the new one automatically.
     */
    private Boolean redirectNewHandle = false;

    public PageUpdateInput build() {
      PageUpdateInput result = new PageUpdateInput();
      result.handle = this.handle;
      result.body = this.body;
      result.isPublished = this.isPublished;
      result.publishDate = this.publishDate;
      result.templateSuffix = this.templateSuffix;
      result.metafields = this.metafields;
      result.title = this.title;
      result.redirectNewHandle = this.redirectNewHandle;
      return result;
    }

    /**
     * A unique, human-friendly string for the page. If no handle is specified, a
     * handle will be generated automatically from the page title.
     * In themes, the Liquid templating language refers to a page by its handle.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * The text content of the page, complete with HTML markup.
     */
    public Builder body(String body) {
      this.body = body;
      return this;
    }

    /**
     * Whether or not the page should be visible. Defaults to `true` if no publish date is specified.
     */
    public Builder isPublished(Boolean isPublished) {
      this.isPublished = isPublished;
      return this;
    }

    /**
     * The date and time (ISO 8601 format) when the page should become visible.
     */
    public Builder publishDate(OffsetDateTime publishDate) {
      this.publishDate = publishDate;
      return this;
    }

    /**
     * The suffix of the template that's used to render the page.
     * If the value is an empty string or `null`, then the default page template is used.
     */
    public Builder templateSuffix(String templateSuffix) {
      this.templateSuffix = templateSuffix;
      return this;
    }

    /**
     * The input fields to create or update a metafield.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The title of the page.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * Whether a redirect is required after a new handle has been provided.
     * If `true`, then the old handle is redirected to the new one automatically.
     */
    public Builder redirectNewHandle(Boolean redirectNewHandle) {
      this.redirectNewHandle = redirectNewHandle;
      return this;
    }
  }
}
