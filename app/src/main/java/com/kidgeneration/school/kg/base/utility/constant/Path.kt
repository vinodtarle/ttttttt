package com.kidgeneration.school.kg.base.utility.constant

class Path {
    companion object {
        private const val comments = "comments"
        private const val likes = "likes"
        private const val ratings = "ratings"
        private const val schools = "schools"
        private const val school_name = "school_name"
        private const val users = "users"

        private const val religions = "religions"
        private const val nationalities = "nationalities"
        private const val states = "states"
        private const val districts = "districts"

        private const val activity = "activity"
        private const val activities = "activities"
        private const val admission = "admission"
        private const val admissions = "admissions"
        private const val alert = "alert"
        private const val alerts = "alerts"
        private const val attendance = "attendance"
        private const val attendances = "attendances"
        private const val branch = "branch"
        private const val branches = "branches"
        private const val certificate = "certificate"
        private const val certificates = "certificates"
        private const val complaint = "complaint"
        private const val complaints = "complaints"
        private const val course = "course"
        private const val courses = "courses"
        private const val daycare = "daycare"
        private const val cares = "cares"
        private const val diary = "diary"
        private const val diaries = "diaries"
        private const val diary_types = "types"
        private const val division = "division"
        private const val divisions = "divisions"
        private const val driver = "driver"
        private const val drivers = "drivers"
        private const val enquiry = "enquiry"
        private const val enquiries = "enquiries"
        private const val event = "event"
        private const val events = "events"
        private const val exam = "exam"
        private const val exams = "exams"
        private const val fee = "fee"
        private const val fees = "fees"
        private const val image = "image"
        private const val homework = "homework"
        private const val homeworks = "homeworks"
        private const val inventory = "inventory"
        private const val inventories = "inventories"
        private const val issue = "issue"
        private const val issues = "issues"
        private const val leave = "leave"
        private const val applications = "applications"
        private const val library = "library"
        private const val libraries = "libraries"
        private const val material = "material"
        private const val materials = "materials"
        private const val meeting = "meeting"
        private const val meetings = "meetings"
        private const val message = "message"
        private const val module = "module"
        private const val modules = "modules"
        private const val notice = "notice"
        private const val notices = "notices"
        private const val result = "result"
        private const val results = "results"
        private const val role = "role"
        private const val roles = "roles"
        private const val route = "route"
        private const val routes = "routes"
        private const val route_stops = "stops"
        private const val school = "school"
        private const val staff = "staff"
        private const val staffs = "staffs"
        private const val standard = "standard"
        private const val standards = "standards"
        private const val stop = "stop"
        private const val stops = "stops"
        private const val student = "student"
        private const val students = "students"
        private const val subject = "subject"
        private const val subjects = "subjects"
        private const val syllabus = "syllabus"
        private const val timetable = "timetable"
        private const val timetables = "timetables"
        private const val transport = "transport"
        private const val tracking = "tracking"
        private const val vehicles = "vehicles"
        private const val vehicle_type = "types"
        private const val topic = "topic"
        private const val topics = "topics"

        fun religions() = "religions"
        fun nationalities() = "nationalities"
        fun states(nationality: String) = "${nationalities()}/$nationality/$states"
        fun districts(nationality: String, state: String) =
            "${states(nationality)}/$state/$districts"

        private fun schoolId() = "V9eTKR16h0DwcLZFy7Fr"
        fun users() = "users"
        fun issues() = "issues"
        fun schoolName() = "school_name"
        fun schools() = "schools"
        fun modules() = "${schools()}/${schoolId()}/$modules"
        fun comments(schoolId: String) = "${schools()}/$schoolId/$comments"
        fun likes(schoolId: String) = "${schools()}/$schoolId/$likes"
        fun ratings(schoolId: String) = "${schools()}/$schoolId/$ratings"

        private fun activity() = "${modules()}/$activity"
        fun activities() = "${activity()}/$activities"

        private fun admission() = "${modules()}/$admission"
        fun admissions() = "${admission()}/$admissions"

        private fun alert() = "${modules()}/$alert"
        fun alerts() = "${alert()}/$alerts"

        private fun attendance() = "${modules()}/$attendance"
        fun attendances() = "${attendance()}/$attendances"

        private fun branch() = "${modules()}/$branch"
        fun branches() = "${branch()}/$branches"

        private fun certificate() = "${modules()}/$certificate"
        fun certificates() = "${certificate()}/$certificates"

        private fun complaint() = "${modules()}/$complaint"
        fun complaints() = "${complaint()}/$complaints"

        private fun course() = "${modules()}/$course"
        fun courses() = "${course()}/$courses"

        private fun daycare() = "${modules()}/$daycare"
        fun cares() = "${daycare()}/$cares"

        private fun diary() = "${modules()}/$diary"
        fun diaries() = "${diary()}/$diaries"
        fun diaryType() = "${diary()}/$diary_types"

        private fun division() = "${modules()}/$division"
        fun divisions() = "${division()}/$divisions"

        private fun driver() = "${modules()}/$driver"
        fun drivers() = "${driver()}/$drivers"

        private fun enquiry() = "${modules()}/$enquiry"
        fun enquiries() = "${enquiry()}/$enquiries"

        private fun event() = "${modules()}/$event"
        fun events() = "${event()}/$events"

        private fun exam() = "${modules()}/$exam"
        fun exams() = "${exam()}/$exams"

        private fun fee() = "${modules()}/$fee"
        fun fees() = "${fee()}/$fees"

        private fun homework() = "${modules()}/$homework"
        fun homeworks() = "${homework()}/$homeworks"

        private fun inventory() = "${modules()}/$inventory"
        fun inventories() = "${inventory()}/$inventories"

        private fun leave() = "${modules()}/$leave"
        fun leaveApplications() = "${leave()}/$applications"

        private fun library() = "${modules()}/$library"
        fun libraries() = "${library()}/$libraries"

        private fun material() = "${modules()}/$material"
        fun materials() = "${material()}/$materials"

        private fun meeting() = "${modules()}/$meeting"
        fun meetings() = "${meeting()}/$meetings"

        private fun notice() = "${modules()}/$notice"
        fun notices() = "${notice()}/$notices"

        private fun result() = "${modules()}/$result"
        fun results() = "${result()}/$results"

        private fun role() = "${modules()}/$role"
        fun roles() = "${role()}/$roles"

        private fun route() = "${modules()}/$route"
        fun routes() = "${route()}/$routes"
        fun routeStops(id: String) = "${routes()}/$id/$route_stops"

        private fun staff() = "${modules()}/$staff"
        fun staffs() = "${staff()}/$staffs"

        private fun standard() = "${modules()}/$standard"
        fun standards() = "${standard()}/$standards"

        private fun stop() = "${modules()}/$stop"
        fun stops() = "${stop()}/$stops"

        private fun student() = "${modules()}/$student"
        fun students() = "${student()}/$students"

        private fun subject() = "${modules()}/$subject"
        fun subjects() = "${subject()}/$subjects"
        fun syllabus() = "${modules()}/$syllabus/$syllabus"

        private fun timetable() = "${modules()}/$timetable"
        fun timetables() = "${timetable()}/$timetables"

        private fun transport() = "${modules()}/$transport"
        fun tracking() = "${transport()}/$tracking"
        fun vehicles() = "${transport()}/$vehicles"
        fun vehicleType() = "${transport()}/$vehicle_type"

        private fun topic() = "${modules()}/$topic"
        fun topics() = "${topic()}/$topics"

        fun fake() = "fake"
        fun chat() = "chat"
        fun x() = "chat"
    }
}
        
    
