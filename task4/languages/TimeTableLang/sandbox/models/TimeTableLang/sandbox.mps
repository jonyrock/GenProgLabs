<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:37e03266-e10d-4e54-88d0-b44dc4dcde09(TimeTableLang.sandbox)">
  <persistence version="8" />
  <language namespace="f28ef78b-dc98-4502-9ce2-abebd24f76f6(TimeTableLang)" />
  <language namespace="ceab5195-25ea-4f22-9b92-103b95ca8c0c(jetbrains.mps.lang.core)" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="tazn" modelUID="r:75af391f-7dcc-4116-bdfd-e4715b91349b(TimeTableLang.structure)" version="3" implicit="yes" />
  <root type="tazn.Timetable" typeId="tazn.8117425987503668721" id="8117425987504037301" nodeInfo="ng">
    <property name="name" nameId="tazn.8117425987504119575" value="Sunday" />
    <node role="lectures" roleId="tazn.8117425987503702173" type="tazn.Lecture" typeId="tazn.8117425987503702178" id="8117425987504069022" nodeInfo="ng">
      <property name="name" nameId="tpck.1169194664001" value="Programming" />
      <property name="inRoom" nameId="tazn.8117425987503708298" value="123" />
      <property name="presenter" nameId="tazn.8117425987503708329" value="Vasiliy Pupkin" />
      <node role="at" roleId="tazn.8117425987503708283" type="tazn.TimeSpanLiteral" typeId="tazn.8117425987503708235" id="8117425987504069023" nodeInfo="ng">
        <property name="fromHours" nameId="tazn.8117425987503708236" value="10" />
        <property name="fromMinutes" nameId="tazn.8117425987503708238" value="00" />
        <property name="toHours" nameId="tazn.8117425987503708241" value="11" />
        <property name="toMinutes" nameId="tazn.8117425987503708245" value="00" />
      </node>
    </node>
  </root>
</model>

