$(document).ready(function(){


			$("#busca").click(function() {

				var tipoCama = $( "#modelo option:selected" ).text();
				var qualidade = $( "#marca option:selected" ).text();
				var cor = $( "#cor option:selected" ).text();

				$("#dadosCarro").empty();

                if (tipoCama == 'casal') {
                  tipoCama = 'casal'
                } else if (tipoCama == 'solteiro') {
                  tipoCama = 'solteiro'
                } else {
                  tipoCama = 'qualquer'
                }
                
                
                if (qualidade == 'luxo') {
                  qualidade = 'luxo'
                } else if (qualidade == 'simples') {
                  qualidade = 'simples'
                } else {
                  qualidade = 'qualquer'
                }
                
                
				var url = "/quarto/"+tipoCama+"/"+qualidade
				
				
				
				//var url = "/quarto/luxo/true/true/true"
                console.log('url:' + url)

				$.getJSON(url, function(data) {

						var itens = [];

						$.each(data, function(i){
						    console.log('>' + this)
							//itens.push("<tr> <td>"+ this.placa +"</td><td>"+ this.espc.modelo + "</td><td>"+ this.espc.marca + "</td><td>"+ this.espc.cor + "</td></tr>");
							var ac = (this.especificacao.temArCondicionado) ? 'Sim' : 'Não'
							itens.push("<tr> <td>"+ this.numero +"</td><td>"+ this.especificacao.cama.length + "</td><td>"+ this.especificacao.tipo + "</td><td>"+ ac + "</td></tr>");
							//itens.push("<tr> <td>"+ this.numero +"</td>");

						});

						$("#dadosCarro").append(itens);

				});

			});

		});
