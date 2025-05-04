package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MetafieldDefinitionIdentifierInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * You can organize your metafields in your Shopify admin by pinning/unpinning metafield definitions.
 * The order of your pinned metafield definitions determines the order in which your metafields are displayed
 * on the corresponding pages in your Shopify admin. By default, only pinned metafields are automatically displayed.
 */
public class MetafieldDefinitionPinGraphQLQuery extends GraphQLQuery {
  public MetafieldDefinitionPinGraphQLQuery(String definitionId,
      MetafieldDefinitionIdentifierInput identifier, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (definitionId != null || fieldsSet.contains("definitionId")) {
        getInput().put("definitionId", definitionId);
    }if (identifier != null || fieldsSet.contains("identifier")) {
        getInput().put("identifier", identifier);
    }
  }

  public MetafieldDefinitionPinGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metafieldDefinitionPin";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String definitionId;

    private MetafieldDefinitionIdentifierInput identifier;

    private String queryName;

    public MetafieldDefinitionPinGraphQLQuery build() {
      return new MetafieldDefinitionPinGraphQLQuery(definitionId, identifier, queryName, fieldsSet);
               
    }

    /**
     * The id of the metafield definition to pin. Using `identifier` is preferred.
     */
    public Builder definitionId(String definitionId) {
      this.definitionId = definitionId;
      this.fieldsSet.add("definitionId");
      return this;
    }

    /**
     * The identifier of the metafield definition to pin.
     */
    public Builder identifier(MetafieldDefinitionIdentifierInput identifier) {
      this.identifier = identifier;
      this.fieldsSet.add("identifier");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
