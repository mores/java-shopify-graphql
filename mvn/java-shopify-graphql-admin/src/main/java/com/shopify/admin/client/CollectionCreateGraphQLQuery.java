package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CollectionInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a [collection](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection)
 * to group [products](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) together
 * in the [online store](https://shopify.dev/docs/apps/build/online-store) and
 * other [sales channels](https://shopify.dev/docs/apps/build/sales-channels).
 * For example, an athletics store might create different collections for running attire, shoes, and accessories.
 *   
 * There are two types of collections:
 *   
 * - **[Custom (manual) collections](https://help.shopify.com/manual/products/collections/manual-shopify-collection)**:
 * You specify the products to include in a collection.
 * - **[Smart (automated) collections](https://help.shopify.com/manual/products/collections/automated-collections)**:
 * You define rules, and products matching those rules are automatically
 * included in the collection.
 *   
 * Use the `collectionCreate` mutation when you need to:
 *   
 * - Create a new collection for a product launch or campaign
 * - Organize products by category, season, or promotion
 * - Automate product grouping using rules (for example, by tag, type, or price)
 *   
 * > Note:
 * > The created collection is unpublished by default. To make it available to customers,
 * use the [`publishablePublish`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/publishablePublish)
 * mutation after creation.
 *   
 * Learn more about [using metafields with smart collections](https://shopify.dev/docs/apps/build/custom-data/metafields/use-metafield-capabilities).
 */
public class CollectionCreateGraphQLQuery extends GraphQLQuery {
  public CollectionCreateGraphQLQuery(CollectionInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CollectionCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "collectionCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CollectionInput input;

    private String queryName;

    public CollectionCreateGraphQLQuery build() {
      return new CollectionCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The properties to use when creating the collection.
     */
    public Builder input(CollectionInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
