package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A predictive search result represents a list of products, collections, pages, articles, and query suggestions
 * that matches the predictive search query.
 */
public class PredictiveSearchResult {
  /**
   * The articles that match the search query.
   */
  private List<Article> articles;

  /**
   * The articles that match the search query.
   */
  private List<Collection> collections;

  /**
   * The pages that match the search query.
   */
  private List<Page> pages;

  /**
   * The products that match the search query.
   */
  private List<Product> products;

  /**
   * The query suggestions that are relevant to the search query.
   */
  private List<SearchQuerySuggestion> queries;

  public PredictiveSearchResult() {
  }

  /**
   * The articles that match the search query.
   */
  public List<Article> getArticles() {
    return articles;
  }

  public void setArticles(List<Article> articles) {
    this.articles = articles;
  }

  /**
   * The articles that match the search query.
   */
  public List<Collection> getCollections() {
    return collections;
  }

  public void setCollections(List<Collection> collections) {
    this.collections = collections;
  }

  /**
   * The pages that match the search query.
   */
  public List<Page> getPages() {
    return pages;
  }

  public void setPages(List<Page> pages) {
    this.pages = pages;
  }

  /**
   * The products that match the search query.
   */
  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  /**
   * The query suggestions that are relevant to the search query.
   */
  public List<SearchQuerySuggestion> getQueries() {
    return queries;
  }

  public void setQueries(List<SearchQuerySuggestion> queries) {
    this.queries = queries;
  }

  @Override
  public String toString() {
    return "PredictiveSearchResult{articles='" + articles + "', collections='" + collections + "', pages='" + pages + "', products='" + products + "', queries='" + queries + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PredictiveSearchResult that = (PredictiveSearchResult) o;
    return Objects.equals(articles, that.articles) &&
        Objects.equals(collections, that.collections) &&
        Objects.equals(pages, that.pages) &&
        Objects.equals(products, that.products) &&
        Objects.equals(queries, that.queries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articles, collections, pages, products, queries);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The articles that match the search query.
     */
    private List<Article> articles;

    /**
     * The articles that match the search query.
     */
    private List<Collection> collections;

    /**
     * The pages that match the search query.
     */
    private List<Page> pages;

    /**
     * The products that match the search query.
     */
    private List<Product> products;

    /**
     * The query suggestions that are relevant to the search query.
     */
    private List<SearchQuerySuggestion> queries;

    public PredictiveSearchResult build() {
      PredictiveSearchResult result = new PredictiveSearchResult();
      result.articles = this.articles;
      result.collections = this.collections;
      result.pages = this.pages;
      result.products = this.products;
      result.queries = this.queries;
      return result;
    }

    /**
     * The articles that match the search query.
     */
    public Builder articles(List<Article> articles) {
      this.articles = articles;
      return this;
    }

    /**
     * The articles that match the search query.
     */
    public Builder collections(List<Collection> collections) {
      this.collections = collections;
      return this;
    }

    /**
     * The pages that match the search query.
     */
    public Builder pages(List<Page> pages) {
      this.pages = pages;
      return this;
    }

    /**
     * The products that match the search query.
     */
    public Builder products(List<Product> products) {
      this.products = products;
      return this;
    }

    /**
     * The query suggestions that are relevant to the search query.
     */
    public Builder queries(List<SearchQuerySuggestion> queries) {
      this.queries = queries;
      return this;
    }
  }
}
