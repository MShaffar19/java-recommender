/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommender/v1beta1/recommender_service.proto

package com.google.cloud.recommender.v1beta1;

/**
 *
 *
 * <pre>
 * Response to the `ListRecommendations` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommender.v1beta1.ListRecommendationsResponse}
 */
public final class ListRecommendationsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommender.v1beta1.ListRecommendationsResponse)
    ListRecommendationsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListRecommendationsResponse.newBuilder() to construct.
  private ListRecommendationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListRecommendationsResponse() {
    recommendations_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListRecommendationsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListRecommendationsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                recommendations_ =
                    new java.util.ArrayList<com.google.cloud.recommender.v1beta1.Recommendation>();
                mutable_bitField0_ |= 0x00000001;
              }
              recommendations_.add(
                  input.readMessage(
                      com.google.cloud.recommender.v1beta1.Recommendation.parser(),
                      extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        recommendations_ = java.util.Collections.unmodifiableList(recommendations_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.recommender.v1beta1.RecommenderProto
        .internal_static_google_cloud_recommender_v1beta1_ListRecommendationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommender.v1beta1.RecommenderProto
        .internal_static_google_cloud_recommender_v1beta1_ListRecommendationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommender.v1beta1.ListRecommendationsResponse.class,
            com.google.cloud.recommender.v1beta1.ListRecommendationsResponse.Builder.class);
  }

  public static final int RECOMMENDATIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.recommender.v1beta1.Recommendation> recommendations_;
  /**
   *
   *
   * <pre>
   * The set of recommendations for the `parent` resource.
   * </pre>
   *
   * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.recommender.v1beta1.Recommendation>
      getRecommendationsList() {
    return recommendations_;
  }
  /**
   *
   *
   * <pre>
   * The set of recommendations for the `parent` resource.
   * </pre>
   *
   * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.recommender.v1beta1.RecommendationOrBuilder>
      getRecommendationsOrBuilderList() {
    return recommendations_;
  }
  /**
   *
   *
   * <pre>
   * The set of recommendations for the `parent` resource.
   * </pre>
   *
   * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
   */
  @java.lang.Override
  public int getRecommendationsCount() {
    return recommendations_.size();
  }
  /**
   *
   *
   * <pre>
   * The set of recommendations for the `parent` resource.
   * </pre>
   *
   * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.recommender.v1beta1.Recommendation getRecommendations(int index) {
    return recommendations_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The set of recommendations for the `parent` resource.
   * </pre>
   *
   * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.recommender.v1beta1.RecommendationOrBuilder getRecommendationsOrBuilder(
      int index) {
    return recommendations_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * A token that can be used to request the next page of results. This field is
   * empty if there are no additional results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token that can be used to request the next page of results. This field is
   * empty if there are no additional results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < recommendations_.size(); i++) {
      output.writeMessage(1, recommendations_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < recommendations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, recommendations_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.recommender.v1beta1.ListRecommendationsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.recommender.v1beta1.ListRecommendationsResponse other =
        (com.google.cloud.recommender.v1beta1.ListRecommendationsResponse) obj;

    if (!getRecommendationsList().equals(other.getRecommendationsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getRecommendationsCount() > 0) {
      hash = (37 * hash) + RECOMMENDATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getRecommendationsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommender.v1beta1.ListRecommendationsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.ListRecommendationsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.ListRecommendationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.ListRecommendationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.ListRecommendationsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.ListRecommendationsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.ListRecommendationsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.ListRecommendationsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.ListRecommendationsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.ListRecommendationsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.ListRecommendationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.ListRecommendationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.recommender.v1beta1.ListRecommendationsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response to the `ListRecommendations` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommender.v1beta1.ListRecommendationsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommender.v1beta1.ListRecommendationsResponse)
      com.google.cloud.recommender.v1beta1.ListRecommendationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.recommender.v1beta1.RecommenderProto
          .internal_static_google_cloud_recommender_v1beta1_ListRecommendationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommender.v1beta1.RecommenderProto
          .internal_static_google_cloud_recommender_v1beta1_ListRecommendationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommender.v1beta1.ListRecommendationsResponse.class,
              com.google.cloud.recommender.v1beta1.ListRecommendationsResponse.Builder.class);
    }

    // Construct using com.google.cloud.recommender.v1beta1.ListRecommendationsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getRecommendationsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (recommendationsBuilder_ == null) {
        recommendations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        recommendationsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.recommender.v1beta1.RecommenderProto
          .internal_static_google_cloud_recommender_v1beta1_ListRecommendationsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.ListRecommendationsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.recommender.v1beta1.ListRecommendationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.ListRecommendationsResponse build() {
      com.google.cloud.recommender.v1beta1.ListRecommendationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.ListRecommendationsResponse buildPartial() {
      com.google.cloud.recommender.v1beta1.ListRecommendationsResponse result =
          new com.google.cloud.recommender.v1beta1.ListRecommendationsResponse(this);
      int from_bitField0_ = bitField0_;
      if (recommendationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          recommendations_ = java.util.Collections.unmodifiableList(recommendations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.recommendations_ = recommendations_;
      } else {
        result.recommendations_ = recommendationsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.recommender.v1beta1.ListRecommendationsResponse) {
        return mergeFrom((com.google.cloud.recommender.v1beta1.ListRecommendationsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.recommender.v1beta1.ListRecommendationsResponse other) {
      if (other
          == com.google.cloud.recommender.v1beta1.ListRecommendationsResponse.getDefaultInstance())
        return this;
      if (recommendationsBuilder_ == null) {
        if (!other.recommendations_.isEmpty()) {
          if (recommendations_.isEmpty()) {
            recommendations_ = other.recommendations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRecommendationsIsMutable();
            recommendations_.addAll(other.recommendations_);
          }
          onChanged();
        }
      } else {
        if (!other.recommendations_.isEmpty()) {
          if (recommendationsBuilder_.isEmpty()) {
            recommendationsBuilder_.dispose();
            recommendationsBuilder_ = null;
            recommendations_ = other.recommendations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            recommendationsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getRecommendationsFieldBuilder()
                    : null;
          } else {
            recommendationsBuilder_.addAllMessages(other.recommendations_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.recommender.v1beta1.ListRecommendationsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.recommender.v1beta1.ListRecommendationsResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.recommender.v1beta1.Recommendation> recommendations_ =
        java.util.Collections.emptyList();

    private void ensureRecommendationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        recommendations_ =
            new java.util.ArrayList<com.google.cloud.recommender.v1beta1.Recommendation>(
                recommendations_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.recommender.v1beta1.Recommendation,
            com.google.cloud.recommender.v1beta1.Recommendation.Builder,
            com.google.cloud.recommender.v1beta1.RecommendationOrBuilder>
        recommendationsBuilder_;

    /**
     *
     *
     * <pre>
     * The set of recommendations for the `parent` resource.
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
     */
    public java.util.List<com.google.cloud.recommender.v1beta1.Recommendation>
        getRecommendationsList() {
      if (recommendationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(recommendations_);
      } else {
        return recommendationsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The set of recommendations for the `parent` resource.
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
     */
    public int getRecommendationsCount() {
      if (recommendationsBuilder_ == null) {
        return recommendations_.size();
      } else {
        return recommendationsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The set of recommendations for the `parent` resource.
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
     */
    public com.google.cloud.recommender.v1beta1.Recommendation getRecommendations(int index) {
      if (recommendationsBuilder_ == null) {
        return recommendations_.get(index);
      } else {
        return recommendationsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The set of recommendations for the `parent` resource.
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
     */
    public Builder setRecommendations(
        int index, com.google.cloud.recommender.v1beta1.Recommendation value) {
      if (recommendationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecommendationsIsMutable();
        recommendations_.set(index, value);
        onChanged();
      } else {
        recommendationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The set of recommendations for the `parent` resource.
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
     */
    public Builder setRecommendations(
        int index, com.google.cloud.recommender.v1beta1.Recommendation.Builder builderForValue) {
      if (recommendationsBuilder_ == null) {
        ensureRecommendationsIsMutable();
        recommendations_.set(index, builderForValue.build());
        onChanged();
      } else {
        recommendationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The set of recommendations for the `parent` resource.
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
     */
    public Builder addRecommendations(com.google.cloud.recommender.v1beta1.Recommendation value) {
      if (recommendationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecommendationsIsMutable();
        recommendations_.add(value);
        onChanged();
      } else {
        recommendationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The set of recommendations for the `parent` resource.
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
     */
    public Builder addRecommendations(
        int index, com.google.cloud.recommender.v1beta1.Recommendation value) {
      if (recommendationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecommendationsIsMutable();
        recommendations_.add(index, value);
        onChanged();
      } else {
        recommendationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The set of recommendations for the `parent` resource.
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
     */
    public Builder addRecommendations(
        com.google.cloud.recommender.v1beta1.Recommendation.Builder builderForValue) {
      if (recommendationsBuilder_ == null) {
        ensureRecommendationsIsMutable();
        recommendations_.add(builderForValue.build());
        onChanged();
      } else {
        recommendationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The set of recommendations for the `parent` resource.
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
     */
    public Builder addRecommendations(
        int index, com.google.cloud.recommender.v1beta1.Recommendation.Builder builderForValue) {
      if (recommendationsBuilder_ == null) {
        ensureRecommendationsIsMutable();
        recommendations_.add(index, builderForValue.build());
        onChanged();
      } else {
        recommendationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The set of recommendations for the `parent` resource.
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
     */
    public Builder addAllRecommendations(
        java.lang.Iterable<? extends com.google.cloud.recommender.v1beta1.Recommendation> values) {
      if (recommendationsBuilder_ == null) {
        ensureRecommendationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, recommendations_);
        onChanged();
      } else {
        recommendationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The set of recommendations for the `parent` resource.
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
     */
    public Builder clearRecommendations() {
      if (recommendationsBuilder_ == null) {
        recommendations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        recommendationsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The set of recommendations for the `parent` resource.
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
     */
    public Builder removeRecommendations(int index) {
      if (recommendationsBuilder_ == null) {
        ensureRecommendationsIsMutable();
        recommendations_.remove(index);
        onChanged();
      } else {
        recommendationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The set of recommendations for the `parent` resource.
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
     */
    public com.google.cloud.recommender.v1beta1.Recommendation.Builder getRecommendationsBuilder(
        int index) {
      return getRecommendationsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The set of recommendations for the `parent` resource.
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
     */
    public com.google.cloud.recommender.v1beta1.RecommendationOrBuilder getRecommendationsOrBuilder(
        int index) {
      if (recommendationsBuilder_ == null) {
        return recommendations_.get(index);
      } else {
        return recommendationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The set of recommendations for the `parent` resource.
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.recommender.v1beta1.RecommendationOrBuilder>
        getRecommendationsOrBuilderList() {
      if (recommendationsBuilder_ != null) {
        return recommendationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(recommendations_);
      }
    }
    /**
     *
     *
     * <pre>
     * The set of recommendations for the `parent` resource.
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
     */
    public com.google.cloud.recommender.v1beta1.Recommendation.Builder addRecommendationsBuilder() {
      return getRecommendationsFieldBuilder()
          .addBuilder(com.google.cloud.recommender.v1beta1.Recommendation.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The set of recommendations for the `parent` resource.
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
     */
    public com.google.cloud.recommender.v1beta1.Recommendation.Builder addRecommendationsBuilder(
        int index) {
      return getRecommendationsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.recommender.v1beta1.Recommendation.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The set of recommendations for the `parent` resource.
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.Recommendation recommendations = 1;</code>
     */
    public java.util.List<com.google.cloud.recommender.v1beta1.Recommendation.Builder>
        getRecommendationsBuilderList() {
      return getRecommendationsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.recommender.v1beta1.Recommendation,
            com.google.cloud.recommender.v1beta1.Recommendation.Builder,
            com.google.cloud.recommender.v1beta1.RecommendationOrBuilder>
        getRecommendationsFieldBuilder() {
      if (recommendationsBuilder_ == null) {
        recommendationsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.recommender.v1beta1.Recommendation,
                com.google.cloud.recommender.v1beta1.Recommendation.Builder,
                com.google.cloud.recommender.v1beta1.RecommendationOrBuilder>(
                recommendations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        recommendations_ = null;
      }
      return recommendationsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token that can be used to request the next page of results. This field is
     * empty if there are no additional results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token that can be used to request the next page of results. This field is
     * empty if there are no additional results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token that can be used to request the next page of results. This field is
     * empty if there are no additional results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token that can be used to request the next page of results. This field is
     * empty if there are no additional results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token that can be used to request the next page of results. This field is
     * empty if there are no additional results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.recommender.v1beta1.ListRecommendationsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommender.v1beta1.ListRecommendationsResponse)
  private static final com.google.cloud.recommender.v1beta1.ListRecommendationsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.recommender.v1beta1.ListRecommendationsResponse();
  }

  public static com.google.cloud.recommender.v1beta1.ListRecommendationsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListRecommendationsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListRecommendationsResponse>() {
        @java.lang.Override
        public ListRecommendationsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListRecommendationsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListRecommendationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListRecommendationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommender.v1beta1.ListRecommendationsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
