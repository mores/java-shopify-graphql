package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Adds products to a [`Collection`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection)
 * asynchronously and returns a
 * [`Job`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Job) to
 * track the operation's progress. This mutation handles large product sets
 * efficiently by processing them in the background.
 *   
 * You can poll the returned job using the
 * [`job`](https://shopify.dev/docs/api/admin-graphql/latest/queries/job) query
 * to monitor completion status.
 *   
 * > Note:
 * > This mutation adds products in the order specified in the [`productIds`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/collectionAddProducts#arguments-productIds) argument.
 */
public class CollectionAddProductsV2GraphQLQuery extends GraphQLQuery {
  public CollectionAddProductsV2GraphQLQuery(String id, List<String> productIds, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (productIds != null || fieldsSet.contains("productIds")) {
        getInput().put("productIds", productIds);
    }
  }

  public CollectionAddProductsV2GraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "collectionAddProductsV2";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private List<String> productIds;

    private String queryName;

    public CollectionAddProductsV2GraphQLQuery build() {
      return new CollectionAddProductsV2GraphQLQuery(id, productIds, queryName, fieldsSet);
               
    }

    /**
     * The ID of the collection that's being updated.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The IDs of the products that are being added to the collection. If the
     * collection's sort order is manual, the products will be added in the order
     * in which they are provided.
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
