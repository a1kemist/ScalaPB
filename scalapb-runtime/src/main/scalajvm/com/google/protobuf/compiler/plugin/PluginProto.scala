// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!

package com.google.protobuf.compiler.plugin

object PluginProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    com.google.protobuf.descriptor.DescriptorProtoCompanion
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      com.google.protobuf.compiler.plugin.Version,
      com.google.protobuf.compiler.plugin.CodeGeneratorRequest,
      com.google.protobuf.compiler.plugin.CodeGeneratorResponse
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """CiVnb29nbGUvcHJvdG9idWYvY29tcGlsZXIvcGx1Z2luLnByb3RvEhhnb29nbGUucHJvdG9idWYuY29tcGlsZXIaIGdvb2dsZ
  S9wcm90b2J1Zi9kZXNjcmlwdG9yLnByb3RvIpQBCgdWZXJzaW9uEiAKBW1ham9yGAEgASgFQgriPwcSBW1ham9yUgVtYWpvchIgC
  gVtaW5vchgCIAEoBUIK4j8HEgVtaW5vclIFbWlub3ISIAoFcGF0Y2gYAyABKAVCCuI/BxIFcGF0Y2hSBXBhdGNoEiMKBnN1ZmZpe
  BgEIAEoCUIL4j8IEgZzdWZmaXhSBnN1ZmZpeCK8AgoUQ29kZUdlbmVyYXRvclJlcXVlc3QSPQoQZmlsZV90b19nZW5lcmF0ZRgBI
  AMoCUIT4j8QEg5maWxlVG9HZW5lcmF0ZVIOZmlsZVRvR2VuZXJhdGUSLAoJcGFyYW1ldGVyGAIgASgJQg7iPwsSCXBhcmFtZXRlc
  lIJcGFyYW1ldGVyElMKCnByb3RvX2ZpbGUYDyADKAsyJC5nb29nbGUucHJvdG9idWYuRmlsZURlc2NyaXB0b3JQcm90b0IO4j8LE
  glwcm90b0ZpbGVSCXByb3RvRmlsZRJiChBjb21waWxlcl92ZXJzaW9uGAMgASgLMiEuZ29vZ2xlLnByb3RvYnVmLmNvbXBpbGVyL
  lZlcnNpb25CFOI/ERIPY29tcGlsZXJWZXJzaW9uUg9jb21waWxlclZlcnNpb24izgMKFUNvZGVHZW5lcmF0b3JSZXNwb25zZRIgC
  gVlcnJvchgBIAEoCUIK4j8HEgVlcnJvclIFZXJyb3ISRQoSc3VwcG9ydGVkX2ZlYXR1cmVzGAIgASgEQhbiPxMSEXN1cHBvcnRlZ
  EZlYXR1cmVzUhFzdXBwb3J0ZWRGZWF0dXJlcxJTCgRmaWxlGA8gAygLMjQuZ29vZ2xlLnByb3RvYnVmLmNvbXBpbGVyLkNvZGVHZ
  W5lcmF0b3JSZXNwb25zZS5GaWxlQgniPwYSBGZpbGVSBGZpbGUaiwEKBEZpbGUSHQoEbmFtZRgBIAEoCUIJ4j8GEgRuYW1lUgRuY
  W1lEjwKD2luc2VydGlvbl9wb2ludBgCIAEoCUIT4j8QEg5pbnNlcnRpb25Qb2ludFIOaW5zZXJ0aW9uUG9pbnQSJgoHY29udGVud
  BgPIAEoCUIM4j8JEgdjb250ZW50Ugdjb250ZW50ImkKB0ZlYXR1cmUSIwoMRkVBVFVSRV9OT05FEAAaEeI/DhIMRkVBVFVSRV9OT
  05FEjkKF0ZFQVRVUkVfUFJPVE8zX09QVElPTkFMEAEaHOI/GRIXRkVBVFVSRV9QUk9UTzNfT1BUSU9OQUxCZwocY29tLmdvb2dsZ
  S5wcm90b2J1Zi5jb21waWxlckIMUGx1Z2luUHJvdG9zWjlnaXRodWIuY29tL2dvbGFuZy9wcm90b2J1Zi9wcm90b2MtZ2VuLWdvL
  3BsdWdpbjtwbHVnaW5fZ28="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor =
    com.google.protobuf.compiler.PluginProtos.getDescriptor()
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}