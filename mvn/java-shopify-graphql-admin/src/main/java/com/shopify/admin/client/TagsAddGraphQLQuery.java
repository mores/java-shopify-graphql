package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Adds tags to a resource. If the resource type doesn't support tagging, the
 * `id` argument returns a resource-not-found error.
 *   
 * Tags help merchants organize and filter resources. See the [`tags`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/tagsAdd#arguments-tags)
 * argument for supported input formats.
 *   
 * Learn more about [using tags to organize subscription orders](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/fulfillments/sync-orders-subscriptions#order-tagging).
 */
public class TagsAddGraphQLQuery extends GraphQLQuery {
  public TagsAddGraphQLQuery(String id, List<String> tags, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (tags != null || fieldsSet.contains("tags")) {
        getInput().put("tags", tags);
    }
  }

  public TagsAddGraphQLQuery(String id, List<String> tags, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (tags != null || fieldsSet.contains("tags")) {
        getInput().put("tags", tags);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public TagsAddGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "tagsAdd";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private List<String> tags;

    private String queryName;

    public TagsAddGraphQLQuery build() {
      return new TagsAddGraphQLQuery(id, tags, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of a resource to add tags to. Supported resources:
     * [`Order`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order), [`DraftOrder`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DraftOrder), [`Customer`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer), [`Product`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product), [`Article`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Article), and [`DiscountNode`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountNode).
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of a resource to add tags to. Supported resources:
     * [`Order`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order), [`DraftOrder`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DraftOrder), [`Customer`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer), [`Product`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product), [`Article`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Article), and [`DiscountNode`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountNode).
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * A list of tags to add to the resource. Can be an array of strings or a
     * single string composed of a comma-separated list of values. Example values:
     * `["tag1", "tag2", "tag3"]`, `"tag1, tag2, tag3"`.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      this.fieldsSet.add("tags");
      return this;
    }

    /**
     * A list of tags to add to the resource. Can be an array of strings or a
     * single string composed of a comma-separated list of values. Example values:
     * `["tag1", "tag2", "tag3"]`, `"tag1, tag2, tag3"`.
     */
    public Builder tagsReference(String variableRef) {
      this.variableReferences.put("tags", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("String"))))).build());
      this.fieldsSet.add("tags");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
