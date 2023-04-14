const { createApp } = Vue

const app = createApp({

    data() {

        return {
            datos: [],

        }
    },
    created() {
        axios.get("http://localhost:8080/api/clients/1" )
            .then(response =>{
                this.datos= response.data
                console.log(this.datos);
            })
            .catch(error => console.log(error))
        
    },
})
app.mount("#app")