<template>
  <div>
    <el-table
        :data="tableData.filter(data => !search || data.sampleId.toLowerCase().includes(search.toLowerCase()))"
        style="width: 100%"
        :show-header="true"
        :highlight-current-row="true"
        :fit="true"
    >

      <el-table-column label="入库单" align="center">
        <el-table-column
            prop="no"
            label="序号"
            width="100%"
            align="center">
        </el-table-column>

        <el-table-column
            prop="sampleId"
            label="样品编号"
            align="center">
        </el-table-column>
        <el-table-column
            prop="surveyShip"
            label="调查船"
            align="center">
        </el-table-column>
        <el-table-column
            prop="voyageNumber"
            label="航次"
            align="center">
        </el-table-column>
        <el-table-column label="详细位置" align="center">
          <el-table-column
              prop="seaArea"
              label="海域"
              width="100%" align="center">
          </el-table-column>
          <el-table-column
              prop="locationArea"
              label="站位"
              width="100%" align="center">
          </el-table-column>
          <el-table-column
              prop="coordinateX"
              label="X坐标"
              width="100%" align="center">
          </el-table-column>
          <el-table-column
              prop="coordinateY"
              label="Y坐标"
              width="100%" align="center">
          </el-table-column>
          <el-table-column
              prop="detailAddress"
              label="详细地址"
              width="100%" align="center">
          </el-table-column>
        </el-table-column>
        <el-table-column
            prop="endDepth"
            label="结束深度（m）"
            align="center">
        </el-table-column>
        <el-table-column
            prop="drillerLength"
            label="心长（m）"
            align="center">
        </el-table-column>
        <el-table-column
            prop="storageLocation"
            label="存放位置"
            align="center">
        </el-table-column>
        <el-table-column
            prop="storageCondition"
            label="保存状况"
            align="center">
        </el-table-column>
        <el-table-column
            prop="name"
            label="备注"
            align="center">
        </el-table-column>
        <el-table-column>
          <template slot="header" slot-scope="scope">
            <el-input
                v-model="search"
                size="mini"
                placeholder="输入关键字搜索"
                width="100%"/>
          </template>
        </el-table-column>

      </el-table-column>
    </el-table>

  </div>
</template>
<style>

</style>
<script>
export default {
  name: 'Table',
  components: {},
  data() {
    return {
      tableData: [],
      search: ''

    }
  },
  created() {
    this.axios(
        {
          method:'GET',
          url:'http://localhost:8081/api/getall'
        }
    ).then((res)=>{
      this.tableData=res.data
      this.$notify({
        title: 'success',
        type: 'success',
        duration: 2500
      })

    }).catch((error)=>{
      this.$notify({
        title: error.message,
        type: 'error',
        duration: 2500
      })
    })
  }
  ,
  methods:{

  }
}
</script>