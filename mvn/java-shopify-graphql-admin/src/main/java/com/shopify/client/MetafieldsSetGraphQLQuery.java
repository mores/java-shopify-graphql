package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MetafieldsSetInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Sets metafield values. Metafield values will be set regardless if they were previously created or not.
 *   
 * Allows a maximum of 25 metafields to be set at a time.
 *   
 * This operation is atomic, meaning no changes are persisted if an error is encountered.
 *   
 * As of `2024-07`, this operation supports compare-and-set functionality to better handle concurrent requests.
 * If `compareDigest` is set for any metafield, the mutation will only set that
 * metafield if the persisted metafield value matches the digest used on
 * `compareDigest`.
 * If the metafield doesn't exist yet, but you want to guarantee that the
 * operation will run in a safe manner, set `compareDigest` to `null`.
 * The `compareDigest` value can be acquired by querying the metafield object and selecting `compareDigest` as a field.
 * If the `compareDigest` value does not match the digest for the persisted value, the mutation will return an error.
 * You can opt out of write guarantees by not sending `compareDigest` in the request.
 */
public class MetafieldsSetGraphQLQuery extends GraphQLQuery {
  public MetafieldsSetGraphQLQuery(List<MetafieldsSetInput> metafields, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (metafields != null || fieldsSet.contains("metafields")) {
        getInput().put("metafields", metafields);
    }
  }

  public MetafieldsSetGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metafieldsSet";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<MetafieldsSetInput> metafields;

    private String queryName;

    public MetafieldsSetGraphQLQuery build() {
      return new MetafieldsSetGraphQLQuery(metafields, queryName, fieldsSet);
               
    }

    /**
     * The list of metafield values to set. Maximum of 25.
     */
    public Builder metafields(List<MetafieldsSetInput> metafields) {
      this.metafields = metafields;
      this.fieldsSet.add("metafields");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
