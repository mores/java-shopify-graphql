package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Contains all fields required to generate sitemaps.
 */
public class Sitemap {
  /**
   * The number of sitemap's pages for a given type.
   */
  private Count pagesCount;

  /**
   * A list of sitemap's resources for a given type.
   *   
   * Important Notes:
   *   - The number of items per page varies from 0 to 250.
   *   - Empty pages (0 items) may occur and do not necessarily indicate the end of results.
   *   - Always check `hasNextPage` to determine if more pages are available.
   */
  private PaginatedSitemapResources resources;

  public Sitemap() {
  }

  /**
   * The number of sitemap's pages for a given type.
   */
  public Count getPagesCount() {
    return pagesCount;
  }

  public void setPagesCount(Count pagesCount) {
    this.pagesCount = pagesCount;
  }

  /**
   * A list of sitemap's resources for a given type.
   *   
   * Important Notes:
   *   - The number of items per page varies from 0 to 250.
   *   - Empty pages (0 items) may occur and do not necessarily indicate the end of results.
   *   - Always check `hasNextPage` to determine if more pages are available.
   */
  public PaginatedSitemapResources getResources() {
    return resources;
  }

  public void setResources(PaginatedSitemapResources resources) {
    this.resources = resources;
  }

  @Override
  public String toString() {
    return "Sitemap{pagesCount='" + pagesCount + "', resources='" + resources + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Sitemap that = (Sitemap) o;
    return Objects.equals(pagesCount, that.pagesCount) &&
        Objects.equals(resources, that.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagesCount, resources);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The number of sitemap's pages for a given type.
     */
    private Count pagesCount;

    /**
     * A list of sitemap's resources for a given type.
     *   
     * Important Notes:
     *   - The number of items per page varies from 0 to 250.
     *   - Empty pages (0 items) may occur and do not necessarily indicate the end of results.
     *   - Always check `hasNextPage` to determine if more pages are available.
     */
    private PaginatedSitemapResources resources;

    public Sitemap build() {
      Sitemap result = new Sitemap();
      result.pagesCount = this.pagesCount;
      result.resources = this.resources;
      return result;
    }

    /**
     * The number of sitemap's pages for a given type.
     */
    public Builder pagesCount(Count pagesCount) {
      this.pagesCount = pagesCount;
      return this;
    }

    /**
     * A list of sitemap's resources for a given type.
     *   
     * Important Notes:
     *   - The number of items per page varies from 0 to 250.
     *   - Empty pages (0 items) may occur and do not necessarily indicate the end of results.
     *   - Always check `hasNextPage` to determine if more pages are available.
     */
    public Builder resources(PaginatedSitemapResources resources) {
      this.resources = resources;
      return this;
    }
  }
}
