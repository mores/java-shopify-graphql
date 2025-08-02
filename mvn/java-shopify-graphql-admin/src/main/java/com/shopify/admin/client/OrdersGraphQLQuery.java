package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.OrderSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a list of
 * [orders](https://shopify.dev/api/admin-graphql/latest/objects/Order) placed in
 * the store, including data such as order status, customer, and line item details.
 * Use the `orders` query to build reports, analyze sales performance, or
 * automate fulfillment workflows. The `orders` query supports
 * [pagination](https://shopify.dev/docs/api/usage/pagination-graphql),
 * [sorting](https://shopify.dev/docs/api/admin-graphql/latest/queries/orders#argument-sortkey), and [filtering](https://shopify.dev/docs/api/admin-graphql/latest/queries/orders#argument-query).
 */
public class OrdersGraphQLQuery extends GraphQLQuery {
  public OrdersGraphQLQuery(Integer first, String after, Integer last, String before,
      Boolean reverse, OrderSortKeys sortKey, String query, String savedSearchId, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (first != null || fieldsSet.contains("first")) {
        getInput().put("first", first);
    }if (after != null || fieldsSet.contains("after")) {
        getInput().put("after", after);
    }if (last != null || fieldsSet.contains("last")) {
        getInput().put("last", last);
    }if (before != null || fieldsSet.contains("before")) {
        getInput().put("before", before);
    }if (reverse != null || fieldsSet.contains("reverse")) {
        getInput().put("reverse", reverse);
    }if (sortKey != null || fieldsSet.contains("sortKey")) {
        getInput().put("sortKey", sortKey);
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (savedSearchId != null || fieldsSet.contains("savedSearchId")) {
        getInput().put("savedSearchId", savedSearchId);
    }
  }

  public OrdersGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "orders";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private OrderSortKeys sortKey;

    private String query;

    private String savedSearchId;

    private String queryName;

    public OrdersGraphQLQuery build() {
      return new OrdersGraphQLQuery(first, after, last, before, reverse, sortKey, query, savedSearchId, queryName, fieldsSet);
               
    }

    /**
     * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder first(Integer first) {
      this.first = first;
      this.fieldsSet.add("first");
      return this;
    }

    /**
     * The elements that come after the specified [cursor](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder after(String after) {
      this.after = after;
      this.fieldsSet.add("after");
      return this;
    }

    /**
     * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder last(Integer last) {
      this.last = last;
      this.fieldsSet.add("last");
      return this;
    }

    /**
     * The elements that come before the specified [cursor](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder before(String before) {
      this.before = before;
      this.fieldsSet.add("before");
      return this;
    }

    /**
     * Reverse the order of the underlying list.
     */
    public Builder reverse(Boolean reverse) {
      this.reverse = reverse;
      this.fieldsSet.add("reverse");
      return this;
    }

    /**
     * Sort the underlying list using a key. If your query is slow or returns an
     * error, then [try specifying a sort key that matches the field used in the search](https://shopify.dev/api/usage/pagination-graphql#search-performance-considerations).
     */
    public Builder sortKey(OrderSortKeys sortKey) {
      this.sortKey = sortKey;
      this.fieldsSet.add("sortKey");
      return this;
    }

    /**
     * A filter made up of terms, connectives, modifiers, and comparators.
     * | name | type | description | acceptable_values | default_value | example_use |
     * | ---- | ---- | ---- | ---- | ---- | ---- |
     * | default | string | Filter by a case-insensitive search of multiple fields
     * in a document. | | | - `query=Bob Norman`<br/> - `query=title:green hoodie` |
     * | cart_token | string | Filter by the cart token's unique value to track
     * abandoned cart conversions or troubleshoot checkout issues. The token
     * references the cart that's associated with an order. | | | -
     * `cart_token:abc123` |
     * | channel | string | Filter by the channel information [`handle`](https://shopify.dev/api/admin-graphql/latest/objects/ChannelInformation#field-ChannelInformation.fields.channelDefinition.handle)
     * (`ChannelInformation.channelDefinition.handle`) field. | | | -
     * `channel:web`<br/> - `channel:web,pos` |
     * | channel_id | id | Filter by the channel [`id`](https://shopify.dev/api/admin-graphql/latest/objects/Channel#field-Channel.fields.id)
     * field. | | | - `channel_id:123` |
     * | chargeback_status | string | Filter by the order's chargeback status. A
     * chargeback occurs when a customer questions the legitimacy of a charge with
     * their financial institution. | - `accepted`<br/> - `charge_refunded`<br/> -
     * `lost`<br/> - `needs_response`<br/> - `under_review`<br/> - `won` | | -
     * `chargeback_status:accepted` |
     * | checkout_token | string | Filter by the checkout token's unique value to
     * analyze conversion funnels or resolve payment issues. The checkout token's
     * value references the checkout that's associated with an order. | | | -
     * `checkout_token:abc123` |
     * | confirmation_number | string | Filter by the randomly generated
     * alpha-numeric identifier for an order that can be displayed to the customer
     * instead of the sequential order name. This value isn't guaranteed to be
     * unique. | | | - `confirmation_number:ABC123` |
     * | created_at | time | Filter by the date and time when the order was created
     * in Shopify's system. | | | - `created_at:2020-10-21T23:39:20Z`<br/> -
     * `created_at:&lt;now`<br/> - `created_at:&lt;=2024` |
     * | credit_card_last4 | string | Filter by the last four digits of the payment
     * card that was used to pay for the order. This filter matches only the last
     * four digits of the card for heightened security. | | | -
     * `credit_card_last4:1234` |
     * | customer_id | id | Filter orders by the customer [`id`](https://shopify.dev/api/admin-graphql/latest/objects/Customer#field-Customer.fields.id)
     * field. | | | - `customer_id:123` |
     * | delivery_method | string | Filter by the delivery [`methodType`](https://shopify.dev/api/admin-graphql/2024-07/objects/DeliveryMethod#field-DeliveryMethod.fields.methodType)
     * field. | - `shipping`<br/> - `pick-up`<br/> - `retail`<br/> - `local`<br/> -
     * `pickup-point`<br/> - `none` | | - `delivery_method:shipping` |
     * | discount_code | string | Filter by the case-insensitive discount code that
     * was applied to the order at checkout. Maximum characters: 255. | | | -
     * `discount_code:ABC123` |
     * | email | string | Filter by the email address that's associated with the
     * order to provide customer support or analyze purchasing patterns. | | | -
     * `email:example@shopify.com` |
     * | financial_status | string | Filter by the order [`displayFinancialStatus`](https://shopify.dev/api/admin-graphql/latest/objects/Order#field-Order.fields.displayFinancialStatus)
     * field. | - `paid`<br/> - `pending`<br/> - `authorized`<br/> -
     * `partially_paid`<br/> - `partially_refunded`<br/> - `refunded`<br/> -
     * `voided`<br/> - `expired` | | - `financial_status:authorized` |
     * | fraud_protection_level | string | Filter by the level of fraud protection
     * that's applied to the order. Use this filter to manage risk or handle
     * disputes. | - `fully_protected`<br/> - `partially_protected`<br/> -
     * `not_protected`<br/> - `pending`<br/> - `not_eligible`<br/> -
     * `not_available` | | - `fraud_protection_level:fully_protected` |
     * | fulfillment_location_id | id | Filter by the fulfillment location [`id`](https://shopify.dev/api/admin-graphql/latest/objects/Fulfillment#field-Fulfillment.fields.location.id)
     * (`Fulfillment.location.id`) field. | | | - `fulfillment_location_id:123` |
     * | fulfillment_status | string | Filter by the [`displayFulfillmentStatus`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order#field-Order.fields.displayFulfillmentStatus)
     * field to prioritize shipments or monitor order processing. | -
     * `unshipped`<br/> - `shipped`<br/> - `fulfilled`<br/> - `partial`<br/> -
     * `scheduled`<br/> - `on_hold`<br/> - `unfulfilled`<br/> - `request_declined`
     * | | - `fulfillment_status:fulfilled` |
     * | gateway | string | Filter by the [`paymentGatewayNames`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order#field-Order.fields.paymentGatewayNames)
     * field. Use this filter to find orders that were processed through specific
     * payment providers like Shopify Payments, PayPal, or other custom payment
     * gateways. | | | - `gateway:shopify_payments` |
     * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:&lt;=1234` |
     * | location_id | id | Filter by the location [`id`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location#field-Location.fields.id)
     * that's associated with the order to view and manage orders for specific
     * locations. For POS orders, locations must be defined in the Shopify admin
     * under **Settings** > **Locations**. If no ID is provided, then the primary
     * location of the shop is returned. | | | - `location_id:123` |
     * | name | string | Filter by the order [`name`](https://shopify.dev/api/admin-graphql/latest/objects/Order#field-name)
     * field. | | | - `name:1001-A` |
     * | payment_id | string | Filter by the payment ID that's associated with the
     * order to reconcile financial records or troubleshoot payment issues. | | | -
     * `payment_id:abc123` |
     * | payment_provider_id | id | Filter by the ID of the payment provider that's
     * associated with the order to manage payment methods or troubleshoot
     * transactions. | | | - `payment_provider_id:123` |
     * | po_number | string | Filter by the order [`poNumber`](https://shopify.dev/api/admin-graphql/latest/objects/order#field-Order.fields.poNumber)
     * field. | | | - `po_number:P01001` |
     * | processed_at | time | Filter by the order [`processedAt`](https://shopify.dev/api/admin-graphql/latest/objects/order#field-Order.fields.processedAt)
     * field. | | | - `processed_at:2021-01-01T00:00:00Z` |
     * | reference_location_id | id | Filter by the ID of a location that's
     * associated with the order, such as locations from fulfillments, refunds, or
     * the shop's primary location. | | | - `reference_location_id:123` |
     * | return_status | string | Filter by the order's [`returnStatus`](https://shopify.dev/api/admin-graphql/latest/objects/Order#field-Order.fields.returnStatus)
     * to monitor returns processing and track which orders have active returns. |
     * - `return_requested`<br/> - `in_progress`<br/> - `inspection_complete`<br/>
     * - `returned`<br/> - `return_failed`<br/> - `no_return` | | -
     * `return_status:in_progress` |
     * | risk_level | string | Filter by the order risk assessment [`riskLevel`](https://shopify.dev/api/admin-graphql/latest/objects/OrderRiskAssessment#field-OrderRiskAssessment.fields.riskLevel)
     * field. | - `high`<br/> - `medium`<br/> - `low`<br/> - `none`<br/> -
     * `pending` | | - `risk_level:high` |
     * | sales_channel | string | Filter by the [sales
     * channel](https://shopify.dev/docs/apps/build/sales-channels) where the order
     * was made to analyze performance or manage fulfillment processes. | | | -
     * `sales_channel: some_sales_channel` |
     * | sku | string | Filter by the product variant [`sku`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-ProductVariant.fields.sku)
     * field. [Learn more about
     * SKUs](https://help.shopify.com/manual/products/details/sku). | | | - `sku:ABC123` |
     * | source_identifier | string | Filter by the ID of the order placed on the
     * originating platform, such as a unique POS or third-party identifier. This
     * value doesn't correspond to the Shopify ID that's generated from a completed
     * draft order. | | | - `source_identifier:1234-12-1000` |
     * | source_name | string | Filter by the platform where the order was placed
     * to distinguish between web orders, POS sales, draft orders, or third-party
     * channels. Use this filter to analyze sales performance across different
     * ordering methods. | | | - `source_name:web`<br/> -
     * `source_name:shopify_draft_order` |
     * | status | string | Filter by the order's status to manage workflows or
     * analyze the order lifecycle. | - `open`<br/> - `closed`<br/> -
     * `cancelled`<br/> - `not_closed` | | - `status:open` |
     * | subtotal_line_items_quantity | string | Filter by the total number of
     * items across all line items in an order. This filter supports both exact
     * values and ranges, and is useful for identifying bulk orders or analyzing
     * purchase volume patterns. | | | - `subtotal_line_items_quantity:10`<br/> -
     * `subtotal_line_items_quantity:5..20` |
     * | tag | string | Filter objects by the `tag` field. | | | - `tag:my_tag` |
     * | tag_not | string | Filter by objects that don’t have the specified tag. | | | - `tag_not:my_tag` |
     * | test | boolean | Filter by test orders. Test orders are made using the [Shopify Bogus Gateway](https://help.shopify.com/manual/checkout-settings/test-orders/payments-test-mode#bogus-gateway)
     * or a payment provider with test mode enabled. | | | - `test:true` |
     * | updated_at | time | Filter by the date and time when the order was last
     * updated in Shopify's system. | | | - `updated_at:2020-10-21T23:39:20Z`<br/>
     * - `updated_at:&lt;now`<br/> - `updated_at:&lt;=2024` |
     * You can apply one or more filters to a query. Learn more about [Shopify API
     * search syntax](https://shopify.dev/api/usage/search-syntax).
     */
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    /**
     * The ID of a [saved search](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch#field-id).
     * The search’s query string is used as the query argument.
     */
    public Builder savedSearchId(String savedSearchId) {
      this.savedSearchId = savedSearchId;
      this.fieldsSet.add("savedSearchId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
