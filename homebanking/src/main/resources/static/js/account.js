const { createApp } = Vue;

createApp({
	data() {
		return {
			account: [],
			transactions: [],
			type: "",
			description: "",

			id: new URLSearchParams(location.search).get('id'),
		};
	},
	created() {
		this.loadData();
	},
	methods: {
		loadData() {
			console.log(this.id)
			axios
				.get('http://localhost:8080/api/accounts/' + this.id)
				.then(response => {
					this.account = response.data;
					this.transactions = this.account.transactions;
					console.log(this.transactions);

				})
				
		},
	},
}).mount('#app');