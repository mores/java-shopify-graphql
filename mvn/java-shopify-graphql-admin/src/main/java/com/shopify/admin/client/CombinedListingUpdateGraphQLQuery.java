package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ChildProductRelationInput;
import com.shopify.admin.types.OptionAndValueInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Add, remove and update `CombinedListing`s of a given Product.
 *   
 * `CombinedListing`s are comprised of multiple products to create a single
 * listing. There are two kinds of products used in a `CombinedListing`:
 *   
 * 1. Parent products
 * 2. Child products
 *   
 * The parent product is created with a `productCreate` with a
 * `CombinedListingRole` of `PARENT`. Once created, you can associate child
 * products with the parent product using this mutation. Parent products
 * represent the idea of a product (e.g. Shoe).
 *   
 * Child products represent a particular option value (or combination of option
 * values) of a parent product. For instance, with your Shoe parent product, you
 * may have several child products representing specific colors of the shoe (e.g.
 * Shoe - Blue). You could also have child products representing more than a
 * single option (e.g. Shoe - Blue/Canvas, Shoe - Blue/Leather, etc...).
 *   
 * The combined listing is the association of parent product to one or more child products.
 *   
 * Learn more about [Combined Listings](https://shopify.dev/apps/selling-strategies/combined-listings).
 */
public class CombinedListingUpdateGraphQLQuery extends GraphQLQuery {
  public CombinedListingUpdateGraphQLQuery(String parentProductId, String title,
      List<ChildProductRelationInput> productsAdded, List<ChildProductRelationInput> productsEdited,
      List<String> productsRemovedIds, List<OptionAndValueInput> optionsAndValues, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (parentProductId != null || fieldsSet.contains("parentProductId")) {
        getInput().put("parentProductId", parentProductId);
    }if (title != null || fieldsSet.contains("title")) {
        getInput().put("title", title);
    }if (productsAdded != null || fieldsSet.contains("productsAdded")) {
        getInput().put("productsAdded", productsAdded);
    }if (productsEdited != null || fieldsSet.contains("productsEdited")) {
        getInput().put("productsEdited", productsEdited);
    }if (productsRemovedIds != null || fieldsSet.contains("productsRemovedIds")) {
        getInput().put("productsRemovedIds", productsRemovedIds);
    }if (optionsAndValues != null || fieldsSet.contains("optionsAndValues")) {
        getInput().put("optionsAndValues", optionsAndValues);
    }
  }

  public CombinedListingUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "combinedListingUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String parentProductId;

    private String title;

    private List<ChildProductRelationInput> productsAdded;

    private List<ChildProductRelationInput> productsEdited;

    private List<String> productsRemovedIds;

    private List<OptionAndValueInput> optionsAndValues;

    private String queryName;

    public CombinedListingUpdateGraphQLQuery build() {
      return new CombinedListingUpdateGraphQLQuery(parentProductId, title, productsAdded, productsEdited, productsRemovedIds, optionsAndValues, queryName, fieldsSet);
               
    }

    /**
     * The ID of the parent product.
     */
    public Builder parentProductId(String parentProductId) {
      this.parentProductId = parentProductId;
      this.fieldsSet.add("parentProductId");
      return this;
    }

    /**
     * The updated title for the combined listing.
     */
    public Builder title(String title) {
      this.title = title;
      this.fieldsSet.add("title");
      return this;
    }

    /**
     * The child products to add and their assigned options and option values.
     */
    public Builder productsAdded(List<ChildProductRelationInput> productsAdded) {
      this.productsAdded = productsAdded;
      this.fieldsSet.add("productsAdded");
      return this;
    }

    /**
     * The child products to edit and their assigned options and option values.
     */
    public Builder productsEdited(List<ChildProductRelationInput> productsEdited) {
      this.productsEdited = productsEdited;
      this.fieldsSet.add("productsEdited");
      return this;
    }

    /**
     * The IDs of products to be removed from the combined listing.
     */
    public Builder productsRemovedIds(List<String> productsRemovedIds) {
      this.productsRemovedIds = productsRemovedIds;
      this.fieldsSet.add("productsRemovedIds");
      return this;
    }

    /**
     * The ordered options and values to be used by the combined listing. Options
     * and values will be reordered to match the order specified here.
     */
    public Builder optionsAndValues(List<OptionAndValueInput> optionsAndValues) {
      this.optionsAndValues = optionsAndValues;
      this.fieldsSet.add("optionsAndValues");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
