package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CountryCode;
import com.shopify.admin.types.LanguageCode;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Triggers a full product resync for the specified [`Channel`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel).
 * All published products are added to the channel's product feed attention set,
 * causing the next poll or event-triggered consumption to receive current state
 * for the complete catalog. Use this mutation after initial channel setup, after
 * recovering from a prolonged outage, or when the channel's external catalog has
 * drifted from Shopify's state.
 *   
 * The sync can be scoped to a specific country and language. When neither is
 * specified, all country-language combinations covered by the channel's
 * specification are triggered.
 */
public class ChannelFullSyncGraphQLQuery extends GraphQLQuery {
  public ChannelFullSyncGraphQLQuery(String channelId, LanguageCode language, CountryCode country,
      OffsetDateTime beforeUpdatedAt, OffsetDateTime updatedAtSince, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (channelId != null || fieldsSet.contains("channelId")) {
        getInput().put("channelId", channelId);
    }if (language != null || fieldsSet.contains("language")) {
        getInput().put("language", language);
    }if (country != null || fieldsSet.contains("country")) {
        getInput().put("country", country);
    }if (beforeUpdatedAt != null || fieldsSet.contains("beforeUpdatedAt")) {
        getInput().put("beforeUpdatedAt", beforeUpdatedAt);
    }if (updatedAtSince != null || fieldsSet.contains("updatedAtSince")) {
        getInput().put("updatedAtSince", updatedAtSince);
    }
  }

  public ChannelFullSyncGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "channelFullSync";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String channelId;

    private LanguageCode language;

    private CountryCode country;

    private OffsetDateTime beforeUpdatedAt;

    private OffsetDateTime updatedAtSince;

    private String queryName;

    public ChannelFullSyncGraphQLQuery build() {
      return new ChannelFullSyncGraphQLQuery(channelId, language, country, beforeUpdatedAt, updatedAtSince, queryName, fieldsSet);
               
    }

    /**
     * The ID of the channel to trigger a full sync for. Accepts a [`Channel`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel) or [`Publication`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication) global ID.
     */
    public Builder channelId(String channelId) {
      this.channelId = channelId;
      this.fieldsSet.add("channelId");
      return this;
    }

    /**
     * The language to scope the sync to. When omitted, all languages for the targeted countries are synced.
     */
    public Builder language(LanguageCode language) {
      this.language = language;
      this.fieldsSet.add("language");
      return this;
    }

    /**
     * The country to scope the sync to. When omitted, all countries covered by the channel's specification are synced.
     */
    public Builder country(CountryCode country) {
      this.country = country;
      this.fieldsSet.add("country");
      return this;
    }

    /**
     * Syncs only products that haven't changed since the specified timestamp.
     */
    public Builder beforeUpdatedAt(OffsetDateTime beforeUpdatedAt) {
      this.beforeUpdatedAt = beforeUpdatedAt;
      this.fieldsSet.add("beforeUpdatedAt");
      return this;
    }

    /**
     * Syncs only products that have changed since the specified timestamp.
     */
    public Builder updatedAtSince(OffsetDateTime updatedAtSince) {
      this.updatedAtSince = updatedAtSince;
      this.fieldsSet.add("updatedAtSince");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
