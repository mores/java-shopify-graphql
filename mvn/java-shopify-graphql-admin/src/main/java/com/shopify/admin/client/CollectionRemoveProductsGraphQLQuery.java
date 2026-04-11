package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Removes multiple products from a collection in a single operation. This
 * mutation can process large product sets (up to 250 products) and may take
 * significant time to complete for collections with many products.
 *   
 * For example, when ending a seasonal promotion, merchants can remove all sale
 * items from a "Summer Clearance" collection at once rather than editing each
 * product individually.
 *   
 * Use `CollectionRemoveProducts` to:
 * - Bulk-remove products from collections efficiently
 * - Clean up collection membership during catalog updates
 * - Implement automated collection management workflows
 *   
 * The operation processes asynchronously to avoid timeouts and performance issues, especially for large product sets.
 *   
 * Learn more about [collection management](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection).
 */
public class CollectionRemoveProductsGraphQLQuery extends GraphQLQuery {
  public CollectionRemoveProductsGraphQLQuery(String id, List<String> productIds, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (productIds != null || fieldsSet.contains("productIds")) {
        getInput().put("productIds", productIds);
    }
  }

  public CollectionRemoveProductsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "collectionRemoveProducts";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private List<String> productIds;

    private String queryName;

    public CollectionRemoveProductsGraphQLQuery build() {
      return new CollectionRemoveProductsGraphQLQuery(id, productIds, queryName, fieldsSet);
               
    }

    /**
     * The ID of the collection to remove products from. The ID must reference an existing manual collection.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The IDs of products to remove from the collection. The mutation doesn't
     * validate that the products belong to the collection or whether the products exist.
     */
    public Builder productIds(List<String> productIds) {
      this.productIds = productIds;
      this.fieldsSet.add("productIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
