package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Type for paginating through multiple sitemap's resources.
 */
public class PaginatedSitemapResources {
  /**
   * Whether there are more pages to fetch following the current page.
   */
  private boolean hasNextPage;

  /**
   * List of sitemap resources for the current page.
   * Note: The number of items varies between 0 and 250 per page.
   */
  private List<SitemapResourceInterface> items;

  public PaginatedSitemapResources() {
  }

  /**
   * Whether there are more pages to fetch following the current page.
   */
  public boolean getHasNextPage() {
    return hasNextPage;
  }

  public void setHasNextPage(boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
  }

  /**
   * List of sitemap resources for the current page.
   * Note: The number of items varies between 0 and 250 per page.
   */
  public List<SitemapResourceInterface> getItems() {
    return items;
  }

  public void setItems(List<SitemapResourceInterface> items) {
    this.items = items;
  }

  @Override
  public String toString() {
    return "PaginatedSitemapResources{hasNextPage='" + hasNextPage + "', items='" + items + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaginatedSitemapResources that = (PaginatedSitemapResources) o;
    return hasNextPage == that.hasNextPage &&
        Objects.equals(items, that.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasNextPage, items);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether there are more pages to fetch following the current page.
     */
    private boolean hasNextPage;

    /**
     * List of sitemap resources for the current page.
     * Note: The number of items varies between 0 and 250 per page.
     */
    private List<SitemapResourceInterface> items;

    public PaginatedSitemapResources build() {
      PaginatedSitemapResources result = new PaginatedSitemapResources();
      result.hasNextPage = this.hasNextPage;
      result.items = this.items;
      return result;
    }

    /**
     * Whether there are more pages to fetch following the current page.
     */
    public Builder hasNextPage(boolean hasNextPage) {
      this.hasNextPage = hasNextPage;
      return this;
    }

    /**
     * List of sitemap resources for the current page.
     * Note: The number of items varies between 0 and 250 per page.
     */
    public Builder items(List<SitemapResourceInterface> items) {
      this.items = items;
      return this;
    }
  }
}
