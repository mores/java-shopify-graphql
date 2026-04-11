package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Adds multiple products to an existing collection in a single operation. This
 * mutation provides an efficient way to bulk-manage collection membership
 * without individual product updates.
 *   
 * For example, when merchants create seasonal collections, they can add dozens
 * of related products at once rather than updating each product individually. A
 * clothing store might add all winter jackets to a "Winter Collection" in one operation.
 *   
 * Use `CollectionAddProducts` to:
 * - Bulk-add products to collections for efficient catalog management
 * - Implement collection building tools in admin interfaces
 * - Organize collection membership during bulk product operations
 * - Reduce API calls when managing large product sets
 *   
 * The mutation processes multiple product additions and returns success status
 * along with any errors encountered during the operation. Products are added to
 * the collection while preserving existing collection settings.
 *   
 * This operation only works with manual collections where merchants explicitly
 * choose which products to include. It will return an error if used with smart
 * collections that automatically include products based on conditions.
 *   
 * Learn more about [collection management](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection).
 */
public class CollectionAddProductsGraphQLQuery extends GraphQLQuery {
  public CollectionAddProductsGraphQLQuery(String id, List<String> productIds, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (productIds != null || fieldsSet.contains("productIds")) {
        getInput().put("productIds", productIds);
    }
  }

  public CollectionAddProductsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "collectionAddProducts";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private List<String> productIds;

    private String queryName;

    public CollectionAddProductsGraphQLQuery build() {
      return new CollectionAddProductsGraphQLQuery(id, productIds, queryName, fieldsSet);
               
    }

    /**
     * The ID of the collection that's being updated. This can't be a smart collection.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The IDs of the products that are being added to the collection.
     * If any of the products is already present in the input collection,
     * then an error is raised and no products are added.
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
