package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves a resource that has translatable fields. Returns the resource's [`Translation`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Translation)
 * objects for different locales and markets, along with the original [`TranslatableContent`](https://shopify.dev/docs/api/admin-graphql/latest/objects/TranslatableContent)
 * and digest values needed to register new translations. Provides access to
 * existing translations, translatable content with digest hashes for translation
 * registration, and nested translatable resources like [`ProductVariant`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant) objects or [`Metafield`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Metafield) objects.
 *   
 * Learn more about [managing translated content](https://shopify.dev/docs/apps/build/markets/manage-translated-content).
 */
public class TranslatableResourceGraphQLQuery extends GraphQLQuery {
  public TranslatableResourceGraphQLQuery(String resourceId, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (resourceId != null || fieldsSet.contains("resourceId")) {
        getInput().put("resourceId", resourceId);
    }
  }

  public TranslatableResourceGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "translatableResource";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String resourceId;

    private String queryName;

    public TranslatableResourceGraphQLQuery build() {
      return new TranslatableResourceGraphQLQuery(resourceId, queryName, fieldsSet);
               
    }

    /**
     * Find a translatable resource by ID.
     */
    public Builder resourceId(String resourceId) {
      this.resourceId = resourceId;
      this.fieldsSet.add("resourceId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
