import request from '@/utils/request'

export default {

  getTeacherListPage(current, limit, teacherQuery) {
    return request({
      url: `/teacher/pageTeacherCondition/${current}/${limit}`,
      method: 'post',
      data: teacherQuery
    })
  },
  deleteById(id){
    return request({
        url: `/teacher/${id}`,
        method: 'delete',
      })
  },
  saveTeacher(teacher){
    return request({
        url: `/teacher/addTeacher`,
        method: 'post',
        data: teacher
      })
  },
  getTeacherInfo(id){
    return request({
        url: `/teacher/getTeacher/${id}`,
        method: 'get'
      })
  },
  updateTeacher(teacher){
    return request({
        url: `/teacher/updateTeacher`,
        method: 'post',
        data: teacher
      })
  },

}