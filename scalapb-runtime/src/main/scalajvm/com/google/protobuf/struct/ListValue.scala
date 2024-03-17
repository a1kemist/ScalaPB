// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!

package com.google.protobuf.struct
import _root_.scalapb.internal.compat.JavaConverters._

/** `ListValue` is a wrapper around a repeated field of values.
  *
  * The JSON representation for `ListValue` is JSON array.
  *
  * @param values
  *   Repeated field of dynamically typed values.
  */
@SerialVersionUID(0L)
final case class ListValue(
    values: _root_.scala.Seq[com.google.protobuf.struct.Value] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[ListValue] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      values.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var __size = __serializedSizeMemoized
      if (__size == 0) {
        __size = __computeSerializedSize() + 1
        __serializedSizeMemoized = __size
      }
      __size - 1
      
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      values.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def clearValues = copy(values = _root_.scala.Seq.empty)
    def addValues(__vs: com.google.protobuf.struct.Value *): ListValue = addAllValues(__vs)
    def addAllValues(__vs: Iterable[com.google.protobuf.struct.Value]): ListValue = copy(values = values ++ __vs)
    def withValues(__v: _root_.scala.Seq[com.google.protobuf.struct.Value]): ListValue = copy(values = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => values
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(values.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: com.google.protobuf.struct.ListValue.type = com.google.protobuf.struct.ListValue
    // @@protoc_insertion_point(GeneratedMessage[google.protobuf.ListValue])
}

object ListValue extends scalapb.GeneratedMessageCompanion[com.google.protobuf.struct.ListValue] with scalapb.JavaProtoSupport[com.google.protobuf.struct.ListValue, com.google.protobuf.ListValue] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.struct.ListValue] with scalapb.JavaProtoSupport[com.google.protobuf.struct.ListValue, com.google.protobuf.ListValue] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.struct.ListValue): com.google.protobuf.ListValue = {
    val javaPbOut = com.google.protobuf.ListValue.newBuilder
    javaPbOut.addAllValues(_root_.scalapb.internal.compat.toIterable(scalaPbSource.values.iterator.map(com.google.protobuf.struct.Value.toJavaProto(_))).asJava)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.ListValue): com.google.protobuf.struct.ListValue = com.google.protobuf.struct.ListValue(
    values = javaPbSource.getValuesList.asScala.iterator.map(com.google.protobuf.struct.Value.fromJavaProto(_)).toSeq
  )
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.struct.ListValue = {
    val __values: _root_.scala.collection.immutable.VectorBuilder[com.google.protobuf.struct.Value] = new _root_.scala.collection.immutable.VectorBuilder[com.google.protobuf.struct.Value]
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __values += _root_.scalapb.LiteParser.readMessage[com.google.protobuf.struct.Value](_input__)
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    com.google.protobuf.struct.ListValue(
        values = __values.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.struct.ListValue] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.struct.ListValue(
        values = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[com.google.protobuf.struct.Value]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = StructProto.javaDescriptor.getMessageTypes().get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = StructProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.google.protobuf.struct.Value
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.struct.ListValue(
    values = _root_.scala.Seq.empty
  )
  implicit class ListValueLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.struct.ListValue]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.struct.ListValue](_l) {
    def values: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.struct.Value]] = field(_.values)((c_, f_) => c_.copy(values = f_))
  }
  final val VALUES_FIELD_NUMBER = 1
  def of(
    values: _root_.scala.Seq[com.google.protobuf.struct.Value]
  ): _root_.com.google.protobuf.struct.ListValue = _root_.com.google.protobuf.struct.ListValue(
    values
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.ListValue])
}
